package edu.sctu.java.day0915;

public class Person {
    String name;
    int age;
    //构造函数
    Person(){
        System.out.println("这是构造函数");
    }
    Person(String name , int age){
        this.name = name;
        this.age = age;
    }
    void study(){
        System.out.println("正在学习");
    }

    int add(int a,int b){
        int c = a + b;
        return  c;
    }
}
