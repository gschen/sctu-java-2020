package edu.sctu.java.day0908;

import edu.sctu.java.day0908.Student;

public class Student1 {

    String name;
    String sexy;
    int age;

    void GetInfo(){
        System.out.println("xinxi");
    }

    public static void main(String[] args) {


        Student1 student = new Student1();
        student.name = "张三";
        student.age = 18;
        student.sexy = "male";
        student.GetInfo();


        Student student1 = new Student();
        student.name = "李四";
        student.age = 16;
        student.sexy = "famale";

        student.GetInfo();
    }
}
