package edu.sctu.java.实验二.Test7;

public class Person {
    String name;
    int age;
    int ID;
    String getInfo(){
        String rAge = String.valueOf(age);
        String rID = String.valueOf(ID);
        return "姓名："+" "+name+"年龄：  "+rAge+"身份证号码：   "+rID;
    }
}
