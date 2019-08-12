package com.designmodel.prototype.factory;

/**
 * @author ys
 * @Description
 * @Date 2019/5/8 10:31
 */
public class Demo {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape cloneShape = ShapeCache.getShape("2");
        cloneShape.draw();
        cloneShape = ShapeCache.getShape("1");
        cloneShape.draw();
        cloneShape = ShapeCache.getShape("3");
        cloneShape.draw();
    }
}
