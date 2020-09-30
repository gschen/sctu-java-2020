package edu.sctu.java.day0922;

public class Student extends Person {
    int StudentNumber;
    String Class;
    void study(){
        System.out.println("正在学习");
    }
    @Override
    void eat(){
        System.out.println("吃饭");
    }

    void sleep(){
        super.sleep();
        System.out.println("学生正在睡觉");
    }
}
