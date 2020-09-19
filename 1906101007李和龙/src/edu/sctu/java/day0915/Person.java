package edu.sctu.java.day0915;

public class Person {
    // 属性
    String name;
    int age;

    Person(){

        System.out.println("构造函数");
    }


    Person(String name,int age){
    this.name = name;
    this.age = age;
    }


    //方法
    void study(){
        System.out.println("学习中");;

    }
}
