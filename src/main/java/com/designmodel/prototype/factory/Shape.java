package com.designmodel.prototype.factory;

import lombok.Data;

/**
 * @author ys
 * @Description
 * @Date 2019/5/8 10:18
 */
@Data
public abstract class Shape implements Cloneable {

    String id;
    String type;

    public abstract void draw();

    @Override
    protected Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
