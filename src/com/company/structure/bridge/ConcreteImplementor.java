package com.company.structure.bridge;

import com.company.structure.bridge.abs.Implementor;

/**
 * <p> 桥接模式  --  具体实现类</p>
 *
 * @className: ConcreteImplementor
 * @package: com.company.structure.bridge
 * @author: wangtong
 * @date: 2021/12/10 10:29 am
 **/

public class ConcreteImplementor implements Implementor {
    @Override
    public void doSomethingA() {
      System.out.println(" bridge do someting A ");
    }

    @Override
    public void doSomethingB() {
       System.out.println(" bridge do somthing B ");
    }
}
