package edu.sctu.java.day0927;

public class Customer implements CustomerAction{

    String name;
    int age;

    @Override
    public void click() {
        System.out.println("顾客正在点击页面");
    }

    @Override
    public void order() {
        System.out.println("顾客正在下单");

    }
}
