package com.company.structure.bridge.abs;

/**
 * <p> 桥接模式 --- 抽象化角色</p>
 * * <pre> 桥接Bridge是用于把 [抽象化与实现化]解耦，使得二者可以独立变化 </pre><br>
 *
 * @className: Abstraction
 * @package: com.company.structure.bridge.abs
 * @author: wangtong
 * @date: 2021/12/10 10:15 am
 **/

public abstract class Abstraction {

    /***
     * @Author wangtong
     * @Description Implementor 实现器   抽象化和实现化解耦
     * @Date 10:21 am 2021/12/10
     * @Param
     * @return
     **/
    private Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public void doSth(){
        System.out.println("abs开始");
        implementor.doSomethingA();
        implementor.doSomethingB();
        System.out.println("abs结束");
    }

    public Implementor getImplementor(){
        return implementor;
    }
}
