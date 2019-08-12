package com.designmodel.decorator;

/**
 * @author ys
 * @Description
 * @Date 2019/5/7 13:54
 * 装饰模式
 */
public class Person {

    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("装扮的" + name);
    }
}
