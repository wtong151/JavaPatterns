package com.company.structure.bridge.db;

/**
 * 〈功能概述〉<br>
 *
 * @className: BridgeTest
 * @package: com.company.structure.bridge.db
 * @author: wangtong
 * @date: 2021/12/10 2:15 pm
 **/

public class BridgeTest {

    public static void main(String[] args){

        Bridge mysqlBridge = new MyBridge();
        Driver mysqlDriver = new Mysql();

        mysqlBridge.setDriver(mysqlDriver);
        mysqlBridge.connect();

        Bridge oracleBridge = new OracleBridge();
        Driver oracleDriver = new Oracle();
        oracleBridge.setDriver(oracleDriver);
        oracleBridge.connect();
    }
}
