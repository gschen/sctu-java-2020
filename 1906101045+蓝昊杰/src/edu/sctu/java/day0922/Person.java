package edu.sctu.java.day0922;

public class Person {
    int age;
    String name;

    void study(){
        System.out.println("我正在学习");
    }
    //重载 overload   方法的名字一致但是输入参数不同。
    void study(String who){
        System.out.println(who+"正在学习");
    }

    void eat(){
        System.out.println("吃苹果");
    }


    public static void main(String[] args) {
        Person p = new Person();
        p.name = "yang";
        p.age = 19;

        p.study();
        p.study("张三");
    }
}

