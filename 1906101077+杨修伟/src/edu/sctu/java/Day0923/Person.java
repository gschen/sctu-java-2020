package edu.sctu.java.Day0923;

public class Person implements PersonAction{

    String name;
    int age;


    @Override
    public void study() {
        System.out.println("普通人正在学习");
    }

    @Override
    public void eat() {
        System.out.println("普通人正在吃饭");

    }

    @Override
    public void run() {
        System.out.println("普通人正在跑步");

    }
}
