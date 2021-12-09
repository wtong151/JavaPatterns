package com.company.structure.proxy.staticProxy;

/**
 * 〈代理模式 代理模式代理类〉<br>
 *
 * @className: Proxy
 * @package: com.company.structure.proxy.staticProxy
 * @author: wangtong
 * @date: 2021/12/9 2:58 pm
 **/

public class Proxy implements Subject {

    private Subject subject;

    public Proxy(Subject realSubject){
       this.subject = realSubject;
    }

    @Override
    public void request() {
      if(subject!=null){
          subject.request();
      }
    }
}
