package com.f1code.comparable;

/**
 * Created by Administrator on 2017/7/18.
 * 用于对公司 数据排名用
 */
public class CompanySortTool {
    /**
     * 获取最小的公司
     * 定义一个获取最小值的方法，限定参与比较的数据 必须绑定Comparable 类型
     * @param a
     * @param <T>
     * @return
     */
    private static <T extends Comparable>  T min(T...a){
        T smallest = a[0];
        for(T item:a){
            if (smallest.compareTo(item) < 0){
                smallest = item;
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        CompanyModel ca = new CompanyModel("CA",156,4025);
        CompanyModel cb = new CompanyModel("CB",183,6536);
        CompanyModel cc = new CompanyModel("CC",256,5000);
        CompanyModel cd = new CompanyModel("CD",98,6536);
        //调用时，只需要调用
        CompanyModel minValue = CompanySortTool.min(ca,cb,cc,cd);

        System.out.println(minValue);


    }
}
