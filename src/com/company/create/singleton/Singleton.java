package com.company.create.singleton;

/**
 * DCL  单例模式 <br>
 *
 * @className: Singleton
 * @package: com.company.create.singleton
 * @author: wangtong
 * @date: 2021/12/8 2:33 pm
 **/

public class Singleton {

    /**
     * @Author wangtong
     * @Description //私有构造方法
     * @Date 2:36 pm 2021/12/8
     * @Param
     * @return
     **/
    private Singleton(){}

    private static volatile Singleton instance;

    public static Singleton getInstance(){
        if(instance == null ){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args){
        //单例模式获取实例
        System.out.println(getInstance());

        System.out.println(instance);
    }
}
