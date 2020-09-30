package edu.sctu.java.day0908;

public class Person {

    //属性
    String name;
    int age;
    String birthday;

    //方法
    void study(){
        System.out.println("我在学习");
    }

    void run(){
        System.out.println("我在跑步");
    }

    //构造函数 不创建时会自动创建
    Person(){
        System.out.println("这是个构造函数");
    }

    //执行入口
    public static void main(String[] args) {

        System.out.println("helloworld");

        Person p1 = new Person();

        p1.name = "一号人员";
        p1.age = 20;

        p1.run();
        p1.study();
    }
}
