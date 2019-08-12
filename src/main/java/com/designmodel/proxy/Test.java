package com.designmodel.proxy;

/**
 * @author ys
 * @Description
 * @Date 2019/5/7 15:01
 */
public class Test {
    public static void main(String[] args) {
        ProxyPursuer proxyPursuer = new ProxyPursuer("韩梅梅");
        proxyPursuer.giveFlowers();
        proxyPursuer.giveChocolate();
        proxyPursuer.giveDolls();
    }
}
