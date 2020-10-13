package edu.sctu.java.实验二.Test15;

public class Graduate implements StudentInterface,TeacherInterface{
    String name;
    String sex;
    int age;
    private double fee;
    private double pay;


    @Override
    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public double getFee() {
        return fee;
    }


    @Override
    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public double getPay() {
        return pay;
    }


}
