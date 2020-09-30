package edu.sctu.java.day0927;

public class Student implements PersonAction {

    int studentId;
    String name;


    @Override
    public void eat() {
        System.out.println("我在学生食堂吃饭");
    }

    @Override
    public void speak() {
        System.out.println("我是一名学生");
    }

    @Override
    public void sleep() {
        System.out.println("我上课睡觉");
    }
}

