package edu.sctu.java.day0922;

public class Person {

    int age;
    String name;

    void study(){

        System.out.println("普通人正在学习.");
    }

    // 重载 overload : 方法名字一致，但是输入参数不同。
    void study(String who){
        System.out.println(who +"正在学习.");

    }

    void study(String name, int age){

        System.out.println("正在学习" + name);
    }
    public static void main(String[] args) {
        Person chen = new Person();
        chen.name = "chen";
        chen.age =  10;

        chen.study();
        chen.study("张三");
    }


}
