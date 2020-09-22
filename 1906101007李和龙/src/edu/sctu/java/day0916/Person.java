package edu.sctu.java.day0916;

public class Person {
    String name;
    int age;
    String sexy;

    Person(){
        System.out.println("构造函数");
    }

    Person(String name,int age,String sexy){
        this.name = name;
        this.age = age;
        this.sexy = sexy;
    }

    void study(){
        System.out.println("学习中");
    }
}
