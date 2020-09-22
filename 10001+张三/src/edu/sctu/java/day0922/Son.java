package edu.sctu.java.day0922;

public class Son extends Father{
    int age = 19;
    String name = "li";

    /*void study(){
        System.out.println("正在学习");
    }*/

    void study(){
        System.out.println("son正在学习！");
    }

    public static void main(String[] args) {
//        Son li = new Son();
//        Father B = new Father();
//        B.f();
//        System.out.println(B.name+B.age);
//        System.out.println();

        Father chen = new Father();
        chen.age = 30;
        chen.name = "chen";
        //chen.study();

        Son chenc = new Son();
        chenc.age = 5;
        chen.name = "chenc";
        //chen.study();

    }

}
