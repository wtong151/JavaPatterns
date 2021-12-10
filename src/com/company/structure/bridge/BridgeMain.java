package com.company.structure.bridge;

import com.company.structure.bridge.abs.Implementor;

/**
 * p> 桥接模式  -- 执行类</p>
 *
 * @className: BridgeMain
 * @package: com.company.structure.bridge
 * @author: wangtong
 * @Date: 2021/12/10 10:31 am
 **/

public class BridgeMain {

    public static void main(String[] args){
        // 实现化角色
        Implementor implementor = new ConcreteImplementor();

        // 抽象化角色
        RefinedAbstraction refinedAbstraction = new RefinedAbstraction(implementor);

        refinedAbstraction.doSth();

        implementor.doSomethingA();
        implementor.doSomethingB();
    }
}
