package edu.sctu.java.day0922;

public class Son extends Father {
    String name;
    int age;

    public static void main(String[] args) {
        Son chen = new Son();
        chen.age=18;
        chen.study();
        //System.out.println("age");

    }
}
//类的继承，实例化的方法

//ctrl+h可查询类的继承关系