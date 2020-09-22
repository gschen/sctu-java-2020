package edu.sctu.java.day0915;

public class Doctor {
    String name;
    int age;
    double salary;
    String position;

    Doctor(String name,int age,double salary,String position){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.position = position;
    }

    void work() {
        System.out.println("正在做手术");
    }

    void rest() {
        System.out.println("今天不是周末,但正在休息中");
    }

    void sleep(){
        System.out.println("他好像已经睡着了");

    }
    public static void main(String[] args){
        Doctor Mark = new Doctor("林以信",18,12000.0,"'主治医师");
        Mark.rest();
        Mark.sleep();
    }
}