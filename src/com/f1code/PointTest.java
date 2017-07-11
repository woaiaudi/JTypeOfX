package com.f1code;

/**
 * Created by Administrator on 2017/7/11.
 */
public class PointTest {
    public static void main(String[] args) {
        Point<Integer> pint = new Point<Integer>();
        pint.setX(12);
        pint.setY(60);

        System.out.println(pint.getX() + "==" + pint.getY());

        Point<Float> pfloat = new Point<Float>();
        pfloat.setX(12.5f);
        pfloat.setY(24.5f);

        System.out.println(pfloat.getX() + "==" + pfloat.getY());



        MorePoint<Integer,String> morePoint = new MorePoint<Integer, String>();
        morePoint.setName("harvic");
        System.out.println("morPont.getName:" + morePoint.getName());

    }
}
