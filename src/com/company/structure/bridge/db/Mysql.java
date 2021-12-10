package com.company.structure.bridge.db;

/**
 * 〈功能概述〉<br>
 *
 * @className: Mysql
 * @package: com.company.structure.bridge.db
 * @author: wangtong
 * @date: 2021/12/10 2:13 pm
 **/

public class Mysql implements Driver {
    @Override
    public void connect() {
        System.out.println(" This is Mysql Driver");
    }
}
