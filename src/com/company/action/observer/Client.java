package com.company.action.observer;

import com.company.action.observer.abs.AbstractSubject;

/**
 * 〈功能概述〉<br>
 *
 * @className: Client
 * @package: com.company.action.observer
 * @author: wangtong
 * @date: 2021/12/10 4:57 pm
 **/

public class Client {

    public static void main(String[] args){
        //生成一个主题角色
        AbstractSubject subject = new ConcreteSubject();

        subject.addObserver(() -> System.out.println("A  你妈喊你吃饭"));

        subject.addObserver(() -> System.out.println("B  你妈喊你吃饭"));

        subject.addObserver(() -> System.out.println("C  你妈喊你吃饭"));

        subject.notification();
    }
}
