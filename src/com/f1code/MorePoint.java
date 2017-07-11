package com.f1code;

/**
 * Created by Administrator on 2017/7/11.
 */
public class MorePoint<T,U> {
    private T x;
    private T y;

    private U name;

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

    public U getName() {
        return name;
    }

    public void setName(U name) {
        this.name = name;
    }
}
