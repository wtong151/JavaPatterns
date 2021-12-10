package com.company.action.observer.abs;

/**
 * @Author wangtong
 * @Description //抽象被观察者
 * @Date 4:52 pm 2021/12/10
 * @Param
 * @return
 **/
public interface AbstractSubject {

    /**
     * @param observer
     */
     void addObserver(AbstractObserver observer);

    /**
     * @param observer
     */
     void removeObserver(AbstractObserver observer);

    /**
     *
     */
     void notification();
}
