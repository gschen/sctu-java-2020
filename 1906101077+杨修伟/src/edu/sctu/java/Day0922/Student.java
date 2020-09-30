package edu.sctu.java.Day0922;

public class Student extends Person{


       //重写
    @Override  //注解 annotation
    void say(){
        super.say();

        System.out.println("儿子蓝说hahhahahha");


    }

    public static void main(String[] args) {
//        Student yang = new Student();
//        yang.say();

//        Person yang = new Person();
//        yang.say();

        Person yang = new Student();
        yang.say();


    }
}
