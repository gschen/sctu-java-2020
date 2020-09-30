package edu.sctu.java.day0915;

public class Person {

    //属性
    int age;
    String name;


    //方法
    void study(){
        System.out.println("在学了在学了");
    }

    //构造函数

    Person(){
        System.out.println("构造函数");
    }

    Person(String name,int age){
        this.name = name;
        this.age = age;
    }


    int add(int a,int b){
       int c;
       c = a + b;
        return  c;
    }

}
