package com.designmodel.prototype.factory;

import java.util.HashMap;

/**
 * @author ys
 * @Description
 * @Date 2019/5/8 10:24
 */
public class ShapeCache {
    private static HashMap<String,Shape> shapeMap = new HashMap<>(3);

    /**
     * 对每种形状都运行数据库查询，并创建该形状
     shapeMap.put(shapeKey, shape);
     例如，我们要添加三种形状
     */
    public static void  loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square =new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }

    public static Shape getShape(String shapeId){
        Shape shape = shapeMap.get(shapeId);
        return (Shape) shape.clone();
    }
}
