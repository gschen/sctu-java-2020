package edu.sctu.java.day0922;

//修饰符：public,static，final，private，protected


public class Person {
    String name;
    int age;
    String position;
    double salary;
    Person(){

    }

    Person(String name, int age, String position, double salary){
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;

    }



    void work(){
        System.out.println( "正在工作！");
    }

    void rest(){
        System.out.println("今天不是周末，不可以休息！");
    }
}

//@+。。。:注解

//重载@overload:方法名字一致，但是输入参数不一样

//重写@override:方法名字一致，重写父类的方法


