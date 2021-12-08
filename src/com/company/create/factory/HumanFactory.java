package com.company.create.factory;

/**
 * 〈功能概述〉<br>
 *
 * @className: HumanFactory
 * @package: com.company.create.factory
 * @author: wangtong
 * @date: 2021/12/8 2:23 pm
 **/

public class HumanFactory extends AbsHumanFactory{
    @Override
    public <T extends Human> T createHumen(Class<T> tclass) {

        Human human = null;
        try {
            human = (T) Class.forName(tclass.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T)human;
    }
}
