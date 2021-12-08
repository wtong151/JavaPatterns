package com.company.create.factory;

import com.company.create.factory.humen.BlackMan;
import com.company.create.factory.humen.WhiteMan;

/**
 * 工厂模式--执行类<br>
 *
 * @className: FactoryMain
 * @package: com.company.create.factory
 * @author: wangtong
 * @date: 2021/12/8 2:27 pm
 **/

public class FactoryMain {
    public static void main(String[] args){
        //初始化工厂
        AbsHumanFactory HumanFactory = new HumanFactory();

        //创建一个黑人
        Human blackHuman = HumanFactory.createHumen(BlackMan.class);
        blackHuman.getColor();

        //创建一个白人
        Human whiteman = HumanFactory.createHumen(WhiteMan.class);
        whiteman.getColor();
    }
}
