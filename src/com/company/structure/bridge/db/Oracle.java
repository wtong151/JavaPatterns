package com.company.structure.bridge.db;

/**
 * 〈功能概述〉<br>
 *
 * @className: Oracle
 * @package: com.company.structure.bridge.db
 * @author: wangtong
 * @date: 2021/12/10 2:14 pm
 **/

public class Oracle implements Driver {
    @Override
    public void connect() {
        System.out.println(" this is Oracle Driver");
    }
}
