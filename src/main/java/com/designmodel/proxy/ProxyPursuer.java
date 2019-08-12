package com.designmodel.proxy;

/**
 * @author ys
 * @Description
 * @Date 2019/5/7 14:58
 * 静态代理
 */
public class ProxyPursuer implements PursueAction{

    Pursuer pursuer;

    public ProxyPursuer(String name) {
        pursuer = new Pursuer("韩梅梅");
    }
    @Override
    public void giveFlowers(){
        pursuer.giveFlowers();
    }
    @Override
    public void giveChocolate(){
        pursuer.giveChocolate();
    }
    @Override
    public void giveDolls(){
        pursuer.giveDolls();
    }
}
