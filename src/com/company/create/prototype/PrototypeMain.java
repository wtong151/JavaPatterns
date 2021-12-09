package com.company.create.prototype;

/**
 * 〈原型模式--执行类〉<br>
 *
 * @className: PrototypeMain
 * @package: com.company.create.prototype
 * @author: wangtong
 * @date: 2021/12/9 2:12 pm
 **/

public class PrototypeMain {

    public static void main(String[] args){
//        shallowCopy();
        deepCopy();
    }

    /***
     * @Author wangtong
     * @Description //执行完可以看到 ShallowCopy 里面的arrayList一直是一个,没有变动过,所有在添加图片的时候,会再原有的基础上添加
     * @Date 2:31 pm 2021/12/9
     * @Param
     * @return
     **/
    private static void shallowCopy(){
        ShallowCopy shallowCopy = new ShallowCopy();

        shallowCopy.setMessage("  先生,您好。您的娃娃已经收货");
        shallowCopy.setReceiver("小明");

        for(int i=0;i<3;i++){
            shallowCopy.addImage("图片"+i);
        }

        for (int i=0;i<10; i++){
            try {
                ShallowCopy sendMsg = (ShallowCopy) shallowCopy.clone();

                sendMsg.setReceiver("顾客"+i);
                //添加顾客的图片
                sendMsg.addImage(sendMsg.getReceiver()+i);
                sendMsg.sendMessage();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }

    }

    /***
     * @Author wangtong
     * @Description //执行完可以看到 充气娃娃图片的数量一直是4,说明里面的arrayList clone的时候里面只有原来的三个,并没有之前增加的
     * @Date 2:36 pm 2021/12/9
     * @Param
     * @return
     **/
    private static void deepCopy(){
        DeepCopy deepCopy=new DeepCopy();
        deepCopy.setMessage("先生,您好。您的充气娃娃已经收货");
        deepCopy.setSend("MirsFang");

        for (int i = 0; i < 3; i++) {
            deepCopy.addImage("图片"+i);
        }

        for (int i = 0; i<10 ; i++) {
            try {
                DeepCopy sendMsg= (DeepCopy) deepCopy.clone();
                sendMsg.setReceiver("顾客"+i);
                //添加顾客的充气娃娃照片
                sendMsg.addImage(sendMsg.getReceiver()+i);
                sendMsg.sendMessage();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
    }
}
