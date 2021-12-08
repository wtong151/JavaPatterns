package com.company.create.factory;

/**
 * 工厂模式--抽象出的工厂<br>
 *
 * @className: AbsHumanFactory
 * @package: com.company.create.factory
 * @author: wangtong
 * @date: 2021/12/8 2:12 pm
 **/

public abstract class AbsHumanFactory {

    public abstract <T extends Human> T createHumen(Class<T> tclass);
}
