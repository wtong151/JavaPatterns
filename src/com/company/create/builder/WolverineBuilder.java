package com.company.create.builder;

/**
 * 金刚狼的builder <br>
 *
 * @className: WolverineBuilder
 * @package: com.company.create.builder
 * @author: wangtong
 * @date: 2021/12/9 10:39 am
 **/

public class WolverineBuilder implements XmanBulider {

    Xman xman;

    public WolverineBuilder() {
        this.xman = new Xman();
    }

    @Override
    public XmanBulider bulidXFactor() {
        xman.setxFactor("claw");
        System.out.println(xman.getxFactor());
        return this;
    }

    @Override
    public XmanBulider buildLover() {
        xman.setLover("Jane");
        System.out.println(xman.getLover());
        return this;
    }

    @Override
    public XmanBulider buildName() {
        xman.setName("Wali");
        System.out.println(xman.getName());
        return this;
    }

    @Override
    public XmanBulider buildAge() {
        xman.setAge("18");
        System.out.println(xman.getAge());
        return this;
    }

    @Override
    public Xman buildXman() {
        System.out.println("Wolverine is successfully built");
        return xman;
    }
}
