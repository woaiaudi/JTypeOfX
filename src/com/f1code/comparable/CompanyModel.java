package com.f1code.comparable;


/**
 * Created by Administrator on 2017/7/18.
 * 定义一个公司实体，
 * 使公司实体需要支持比较
 */
public class CompanyModel implements Comparable<CompanyModel>{
    private String name;//公司名称
    private int employeeCount;//雇员数量
    private double marketCapitalisation;//公司市值

    public CompanyModel(String name, int employeeCount, double marketCapitalisation) {
        this.name = name;
        this.employeeCount = employeeCount;
        this.marketCapitalisation = marketCapitalisation;
    }

    public double getMarketCapitalisation() {
        return marketCapitalisation;
    }

    public void setMarketCapitalisation(double marketCapitalisation) {
        this.marketCapitalisation = marketCapitalisation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    @Override
    public String toString() {
        return "CompanyModel{" +
                "marketCapitalisation=" + marketCapitalisation +
                ", name='" + name + '\'' +
                ", employeeCount=" + employeeCount +
                '}';
    }

    /**
     * 这里去实现，当前这个 CompanyModel 对象 与另外一个CompanyModel对象比较的具体逻辑
     * @param i
     * @return
     * >0 : this > i
     * =0 :this == i
     * <0 :this < i
     */
    @Override
    public int compareTo(CompanyModel i) {
        //公司比较，权重从高到低依次是 ：公司市值 》 雇员数量
        int result = 1;
        if (i != null){
            if (this.getMarketCapitalisation() > i.getMarketCapitalisation()){
                result = 1;
            }else if (this.getMarketCapitalisation() < i.getMarketCapitalisation()){
                result = -1;
            }else{
                //市值相同情况下比较 雇员数量
                if (this.getEmployeeCount() > i.getEmployeeCount()){
                    result = 1;
                }else if (this.getEmployeeCount() < i.getEmployeeCount()){
                    result = -1;
                }else{

                        result = 0;
                }
            }
        }else {
            result = 1;
        }
        return result;
    }
}
