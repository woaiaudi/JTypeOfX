package com.f1code.calsstype;

/**
 * Created by Administrator on 2017/7/17.
 */
public class InfoImpl<T,K,U> implements Info<U> {
    private U var;
    private T x;
    private K y;

    public InfoImpl(U var) {  // 通过构造方法设置属性内容
        this.setVar(var);
    }

    @Override
    public U getVar() {
        return this.var;
    }

    @Override
    public void setVar(U var) {
        this.var = var;
    }
}
