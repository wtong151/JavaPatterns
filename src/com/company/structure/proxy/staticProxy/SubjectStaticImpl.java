package com.company.structure.proxy.staticProxy;

/**
 * 〈代理模式真实类〉<br>
 *
 * @className: SubjectImpl
 * @package: com.company.structure.proxy.staticProxy
 * @author: wangtong
 * @date: 2021/12/9 2:55 pm
 **/

public class SubjectStaticImpl implements Subject {
    @Override
    public void request() {

        System.out.println(" 静态代理真实类 重写方法");

    }
}
