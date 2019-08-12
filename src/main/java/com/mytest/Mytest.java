package com.mytest;

import java.util.function.BiPredicate;
import java.util.function.Function;

/**
 * @author ys
 * @Description
 * @Date 2019/5/13 13:39
 */
public class Mytest {

    public static void main(String[] args) {
        User user = new User("张三",23);
        testFunction(user,new MyFunction());
        //testBiPredicate("小王",22,(name,age)->name.indexOf("小")>=0 && age>20);
    }

    public static void testFunction(User user ,Function<User,User> function){

        System.out.println("测试函数式接口:" + function.apply(user));
    }
    public static void testBiPredicate(String name,Integer age,BiPredicate<String,Integer> biPredicate){

        System.out.println(biPredicate.and((n,a)->name.length()>22).test(name,age));
    }
}
