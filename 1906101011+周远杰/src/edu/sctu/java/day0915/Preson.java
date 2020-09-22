package edu.sctu.java.day0915;

import org.omg.CORBA.INTERNAL;

public class Preson {
    //属性
    String name;
    int age;

    Preson(){
        System.out.println("这是构造函数！");
    }
    Preson(String name,int age){
        super();
        this.name = name;
        this.age = age;
    }

    //方法
    void study() {
        System.out.println("正在学习！");
    }

    int add(int a, int b){
       int c;
       c=a+b;
       return c;
    }
}
