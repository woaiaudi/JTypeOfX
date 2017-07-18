package com.f1code.calsstype;

/**
 * Created by Administrator on 2017/7/17.
 */
public class ClassTypeMain {
    public static void main(String[] args) {
        InfoImpl<Integer,Double,String> i = new InfoImpl<Integer,Double,String>("llllllllllllllllllllllllllllll");
        System.out.println(i.getVar()) ;
    }
}
