package edu.sctu.java.day0915;

import java.sql.SQLOutput;

public class Person {
    //属性
    String name;
    int age;
    //方法
/*
*     int add(int a ,int b){
        int c;
         c=a+b;
         return c;
         * */
//    Person(){
//        System.out.println("这是构造函数！");
//        //初始化类的一些属性，
//    }
    Person(String name, int age){
        this.name=name;
        this.age=age;
        //this 表示这个类 (小括号接受的输入内容)
    }

    void study(){
        System.out.println("正在学习！");
    }

    }
