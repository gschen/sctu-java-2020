package edu.sctu.java.day0923;

public class Person1 implements PersonAction{

    String name;
    int age;

    @Override
    public void study(){
        System.out.println("普通人正在学习！");
    }

}
