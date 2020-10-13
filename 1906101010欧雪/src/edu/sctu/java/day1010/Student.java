package edu.sctu.java.day1010;

public class Student {
    int number;
    int classID;
    String name;
    String gender;
    int age;
    void getNumber(){
        System.out.println("学号："+number);
    }
    void getClassID(){
        System.out.println("班号："+classID);
    }
    void getGender(){
        System.out.println("性别："+gender);
    }

    void getName() {
        System.out.println("姓名："+name);
    }

    void getAge(){
        System.out.println("年龄："+age);
    }
    public String toString(){
            return name+age+classID+gender+number;
    }
}
