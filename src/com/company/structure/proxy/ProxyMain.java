package com.company.structure.proxy;

import com.company.structure.proxy.dynamicProxy.Subject;
import com.company.structure.proxy.dynamicProxy.SubjectDynamicImpl;
import com.company.structure.proxy.dynamicProxy.SubjectInvocationHandler;
import com.company.structure.proxy.staticProxy.Proxy;
import com.company.structure.proxy.staticProxy.SubjectStaticImpl;

/**
 * 代理模式验证运行类
 *
 * @className: ProxyMain
 * @package: com.company.structure.proxy
 * @author: wangtong
 * @date: 2021/12/9 3:20 pm
 **/

public class ProxyMain {

    public static void main(String[] args){
        dynamicProxy();
        staticProxy();
    }

    private static void staticProxy(){

        SubjectStaticImpl subjectStatic = new SubjectStaticImpl();
        Proxy proxy = new Proxy(subjectStatic);
        proxy.request();
    }

    private static void dynamicProxy(){

        SubjectDynamicImpl realsubject = new SubjectDynamicImpl();
        SubjectInvocationHandler handler = new SubjectInvocationHandler(realsubject);
        Subject subject = (Subject) handler.getProxy();
        subject.request();
    }
}
