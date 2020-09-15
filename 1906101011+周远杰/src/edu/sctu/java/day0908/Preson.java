package edu.sctu.java.day0908;

public class Preson {
    //1.属性：姓名，年龄，性别等。
    String name = "linyixin";
    int age = 18;
    String gender = "男";
    String major = "国家政务管理";

    //2.方法，行为：学习、跑步、看电影等
    void study() {
        System.out.println("日常学习国家政务");
    }

    void run() {
        System.out.println("日常夜跑");
    }

    void movie() {
        System.out.println("一天一部电影");
    }

    //构造函数
    Preson(){

        System.out.println("这是构造函数！");
    }
}