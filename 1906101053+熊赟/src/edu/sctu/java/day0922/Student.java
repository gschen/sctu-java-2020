package edu.sctu.java.day0922;

public class Student extends Person {

    @Override  //注解 annotation
    void study() {

        System.out.println("学生正在学习");
    }

    public static void main(String[] args) {
        Student aaa = new Student();
        aaa.study();
    }
}
