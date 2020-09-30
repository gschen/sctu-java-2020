package edu.sctu.java.day0922;

public class Person {
    int age ;
    String name;

    void study(){
        System.out.println("学习方法1");
    }

    //重载   overload :方法的名字一致，但输出的参数不同。
    void study(String who){
        System.out.println(who+"正在学习");

    }

    public static void main(String[] args) {
        Person a = new Person();
        a.age = 18;
        a.name = "jiang";

        a.study();
        a.study("zhangs");

    }
}
