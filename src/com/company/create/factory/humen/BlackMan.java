package com.company.create.factory.humen;

import com.company.create.factory.Human;

/**
 * 〈功能概述〉<br>
 *
 * @className: BlackMan
 * @package: com.company.create.factory.humen
 * @author: wangtong
 * @date: 2021/12/8 2:20 pm
 **/

public class BlackMan implements Human {
    @Override
    public void getColor() {
        System.out.println("这是个黑人");
    }
}
