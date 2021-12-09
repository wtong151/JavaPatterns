package com.company.create.builder;

/**
 * 〈测试类，生成一个金刚狼〉<br>
 *
 * @className: BuilderTest
 * @package: com.company.create.builder
 * @author: wangtong
 * @date: 2021/12/9 10:52 am
 **/

public class BuilderTest {

    public static void main(String[] args){
        WolverineDirector director = new WolverineDirector();
        Xman wolverines = director.constructWolverine(new WolverineBuilder());

        String lover = wolverines.getLover();
        String age = wolverines.getAge();
        String name = wolverines.getName();
        String factor = wolverines.getxFactor();

        System.out.println("lover:"+lover+"  factor:"+factor+" name:"+name+" age:"+age);

        System.out.println(wolverines.toString());
    }
}
