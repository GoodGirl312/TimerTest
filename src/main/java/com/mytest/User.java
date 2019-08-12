package com.mytest;

import lombok.Data;

/**
 * @author ys
 * @Description
 * @Date 2019/5/13 14:13
 */
@Data
public class User {
    String name;
    int age;

    public User() {
    }

    public User(String name,  int age) {
        this.name = name;
        this.age = age;
    }

}
