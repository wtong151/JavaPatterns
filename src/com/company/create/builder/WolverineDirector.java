package com.company.create.builder;

/**
 * 〈控制builder 生成金刚狼〉<br>
 *
 * @className: WolverineDirector
 * @package: com.company.create.builder
 * @author: wangtong
 * @date: 2021/12/9 10:46 am
 **/

public class WolverineDirector {

    public Xman constructWolverine(WolverineBuilder wolverineBuilder){

        return wolverineBuilder.bulidXFactor().buildLover().buildAge().buildName().buildXman();
    }
}
