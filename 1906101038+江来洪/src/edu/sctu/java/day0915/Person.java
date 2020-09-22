package edu.sctu.java.day0915;

public class Person {
    //属性
    String name;
    int age;
    //方法;

    //构造函数
    Person(){
        System.out.println("我是构造函数");
    }
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    void study(){
        System.out.println("我在学习");
    }
    int add(int a,int b){
        int c;
        c = a + b;
        return c;
    }
}
