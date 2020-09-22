package edu.sctu.java.day0922;

public class Person {
    int age;
    String name;

    /*void study(){
        System.out.println("学习方法一");
    }*/

    //重载 overload:方法的名字一致，但是输入参数不同。
    void study(){
        System.out.println("普通人正在学习");
    }


    public static void main(String[] args) {
        Person chen = new Person();
        chen.name="chen";
        chen.age=18;
        chen.study();
    }
}
