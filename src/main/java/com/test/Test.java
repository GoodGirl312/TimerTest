package com.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ys
 * @Description
 * @Date 2019/5/10 16:42
 */
public class Test {
    public static void main(String[] args) {

       /* String str = "abcdacd";
        System.out.println(getMap(str));*/
        //System.out.println(31 % 32);
        int a = 2;
        /*System.out.println(1 << (15 % 32));
        System.out.println(a |= (1 << (15 % 32)));*/
        System.out.println(a |= (1<< 2%4));
    }

    public static Map<String, Integer> getMap(String str) {
        Map<String, Integer> map = new HashMap<>(str.length());

        for (int i = 0; i < str.length(); i++) {
            String temp = String.valueOf(str.charAt(i));
            if (map.containsKey(temp)) {
                map.put(temp, map.get(temp) + 1);
            } else {
                map.put(temp, 1);
            }
        }
        return map;
    }
}
