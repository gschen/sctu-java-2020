package edu.sctu.java.day0922;

public class Student extends Person{
    int age;
    String name;

    @Override
    void study(){
        System.out.println("子辈爱学习");
        super.study();
    }


    void eat(){
        System.out.println("I am eating");
    }
}
