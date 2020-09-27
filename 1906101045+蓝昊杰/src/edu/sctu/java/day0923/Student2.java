package edu.sctu.java.day0923;

public class Student2 extends Student{

    @Override
    void study(){
        System.out.println("我不在学习");
    }

    public static void main(String[] args) {
        Student2 ss = new Student2();
        ss.study();
    }
}
