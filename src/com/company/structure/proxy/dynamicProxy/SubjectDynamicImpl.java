package com.company.structure.proxy.dynamicProxy;

/**
 * 〈动态代理真实类〉<br>
 *
 * @className: SubjectImpl
 * @package: com.company.structure.proxy.dynamicProxy
 * @author: wangtong
 * @date: 2021/12/9 3:01 pm
 **/

public class SubjectDynamicImpl implements Subject {
    @Override
    public void request() {
     System.out.println(" 动态代理真实类 重新方法");
    }
}
