package com.mytest;

import java.util.function.Function;

/**
 * @author ys
 * @Description
 * @Date 2019/5/13 14:11
 */
public class MyFunction implements Function {
    @Override
    public Object apply(Object o) {
        User user = (User) o;
        if (user.getAge() < 11) {
            System.out.println(user.getName() + " " + user.getAge());
        }
        return user;
    }
}
