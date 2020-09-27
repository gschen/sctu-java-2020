package edu.sctu.java.Day0922;

public class Son extends Father{
    int age;
    String name;

    void eat(){
        System.out.println("儿子吃饭");
    }
    void say(){
        System.out.println("儿子说hahhahha");
    }


    public static void main(String[] args) {
        Son lan = new Son();
        lan.age = 19;
        lan.name = "lan";
        lan.eat();

        Father yang = new Father();
        yang.age = 18;
        yang.name = "yang";
        yang.say();
    }
}
