package edu.sctu.java.day0922;

public class Child extends Father {

//    public Child(String name, int age) {
//        super(name, age);
//    }

    public void study(){
        System.out.println("儿子在认真学习");
    }

    @Override
    public void drank(){
        super.drank();

        System.out.println("儿子偶尔小酌");
    }

}
