package com.company.action.observer;

import com.company.action.observer.abs.AbstractObserver;
import com.company.action.observer.abs.AbstractSubject;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体主题角色 <br>
 *
 * @className: ConcreteSubject
 * @package: com.company.action.observer
 * @author: wangtong
 * @date: 2021/12/10 4:54 pm
 **/

public class ConcreteSubject implements AbstractSubject {

    List<AbstractObserver> list = new ArrayList<>();

    @Override
    public void addObserver(AbstractObserver observer) {
          list.add(observer);
    }

    @Override
    public void removeObserver(AbstractObserver observer) {

        list.remove(observer);
    }

    @Override
    public void notification() {
         for(AbstractObserver observer : list){
             observer.update();
         }
    }
}
