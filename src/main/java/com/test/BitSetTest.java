package com.test;

import java.io.IOException;
import java.util.BitSet;
import java.util.Random;

/**
 * @author ys
 * @Description
 * @Date 2019/5/17 14:18
 */
public class BitSetTest {

    static long number = 100;

    public static void main(String[] args) throws IOException {

        //boolean flag = exists(200);
       // System.out.println(flag);

       getBitSet();
    }

    /*public static boolean exists(int num) {
        BitSet bitSet = getBitSet(number);
        //创建一个bitSet
        return bitSet.get(num);
    }*/

    /**
     * '初始化
     *
     * @param
     * @return
     */
    public static BitSet getBitSet() {
        BitSet bitSet = new BitSet(Integer.MAX_VALUE);
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int num = r.nextInt();
            if (num > 0) {
                System.out.println(num);
                bitSet.set(num);
            }
        }
        return bitSet;
    }
}
