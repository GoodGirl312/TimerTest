package com.mytest;

import java.util.function.BiPredicate;

/**
 * @author ys
 * @Description
 * @Date 2019/5/13 14:25
 */
public class MyBiPredicate implements BiPredicate {
    @Override
    public boolean test(Object o, Object o2) {
        if (o.toString().equals("age") && Integer.valueOf(o2.toString()) > 20) {
            return true;
        } else {
            return false;
        }
    }
}
