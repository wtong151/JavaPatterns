package com.company.create.prototype.prototypeAbs;

import java.util.ArrayList;

/**
 * 〈功能概述〉<br>
 *
 * @className: BaseMessage
 * @package: com.company.create.prototype.prototypeAbs
 * @author: wangtong
 * @date: 2021/12/9 2:02 pm
 **/

public abstract class BaseMessage {

    private String send;

    private String receiver;

    private String message;

    private ArrayList<String> imgList = new ArrayList<>();

    public String getSend() {
        return send;
    }

    public void setSend(String send) {
        this.send = send;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ArrayList<String> getImgList() {
        return imgList;
    }

    public void setImgList(ArrayList<String> imgList) {
        this.imgList = imgList;
    }


    public void addImage(String image){
        getImgList().add(image);
    }
    /*
     * 发送消息
     */
    public void sendMessage(){
        System.out.println(getReceiver()+getMessage()+"     充气娃娃图片数量"+getImgList().size()+"     发件人"+getSend());
    }
}
