package com.company.structure.bridge;

import com.company.structure.bridge.abs.Abstraction;
import com.company.structure.bridge.abs.Implementor;

/**
 * <p> 桥接模式  --- 具体抽象化角色</p>
 *
 * @className: RefinedAbstraction
 * @package: com.company.structure.bridge
 * @author: wangtong
 * @date: 2021/12/10 10:35 am
 **/

public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void doSth() {
        super.doSth();
        getImplementor().doSomethingA();
        getImplementor().doSomethingB();
    }
}
