package edu.sctu.java.day0908;

import javax.xml.namespace.QName;

public class Person {
//    属性；姓名，年龄，姓别,身高，体重
//    方法；study,run,gomoive

    Person(String name,int age){
        this.name = name;
        this.age = age;



    }

    String name;
    int age;

    void sudy(){
        System.out.println("studying");

    }
    void run(){
        System.out.println("runing");

    }
    void gomoive(){
        System.out.println("gomoiveing");

    }





}
