package com.company.create.builder;

/**
 * 〈功能概述〉<br>
 *
 * @className: XmanBulider
 * @package: com.company.create.builder
 * @author: wangtong
 * @date: 2021/12/9 10:35 am
 **/

public interface XmanBulider {

    XmanBulider bulidXFactor();

    XmanBulider buildLover();

    XmanBulider buildName();

    XmanBulider buildAge();

    Xman buildXman();
}
