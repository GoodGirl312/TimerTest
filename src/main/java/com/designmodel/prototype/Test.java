package com.designmodel.prototype;

import lombok.extern.slf4j.Slf4j;

/**
 * @author ys
 * @Description
 * @Date 2019/5/8 9:56
 */
public class Test {
    public static void main(String[] args) {

        Resume a = new Resume("丽丽",22,"女");
        Resume b = (Resume) a.clone();

        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}
