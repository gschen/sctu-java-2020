package edu.sctu.java.day0922;

public class Student extends Person{

    @Override//表示子类方法重写了负类的方法
    void study(){
//        super.study();

        System.out.println("hhh");
    }

//    public static void main(String[] args) {
//        Person p = new Person();
//        Student s = new Student();
//        s.study("hhh");
        //p.study("hhh");
    }
//}
