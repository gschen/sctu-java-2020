package edu.sctu.java.day0915;

public class Doc {
    int age ;
    String name ;
    double Salary;
    String Position ;
    void CheckForPatient(){
        System.out.println("正在检查");
    }
    void Rest(){
        System.out.println("休息中");

    }
    void Surgery(){
        System.out.println("正在做手术");
    }
    void Sleep(){
        System.out.println("正在睡觉");
    }
    //构造函数
    Doc(){
        System.out.println("这是构造函数");
    }
    //有参构造
    Doc(String name,int age){
        this.name = name;
        this.age = age;
    }
}
