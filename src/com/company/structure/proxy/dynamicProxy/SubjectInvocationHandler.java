package com.company.structure.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * <p> 动态代理模式 --
 * 利用java.lang.reflect.Proxy类和java.lang.reflect.InvocationHandler接口定义代理类的实现
 * </p>
 *
 * @className: SubjectInvocationHandler
 * @package: com.company.structure.proxy.dynamicProxy
 * @author: wangtong
 * @date: 2021/12/9 3:08 pm
 **/
public class SubjectInvocationHandler implements InvocationHandler {

    private Object target;

    public SubjectInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("动态代理调用方法开始");
        Object result = method.invoke(target, args);
        System.out.println("动态代理调用方法结束");

        return result;
    }

    public Object getProxy(){
        ClassLoader loader = Thread.currentThread().getContextClassLoader();

        Class<?>[]  interfaces = target.getClass().getInterfaces();

        return Proxy.newProxyInstance(loader, interfaces, this);
    }
}
