package com.company.structure.bridge.db;

/**
 * 〈功能概述〉<br>
 *
 * @className: Bridge
 * @package: com.company.structure.bridge.db
 * @author: wangtong
 * @date: 2021/12/10 2:08 pm
 **/

public abstract class Bridge {

    private Driver driver;

    public void connect(){
        driver.connect();
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
