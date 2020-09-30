package edu.sctu.java.day0915;

public class Person {
    String name;
    int age;

    void study() {
        System.out.println("正在学习");
    }

    void eat(){
        System.out.println("正在吃饭");
    }

    Person(){
        System.out.println("这是一个构造函数");
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.study();
    }
}

