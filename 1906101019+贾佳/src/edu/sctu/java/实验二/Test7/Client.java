package edu.sctu.java.实验二.Test7;

public class Client {
    public static void main(String[] args) {
        Person per = new Person();
        Student std = new Student();
        std.age=10;
        std.ID=513123333;
        std.name="John";
        std.StudentID=333;
        std.SchoolLocation="beijing";
        System.out.println(std.getInfo());
    }
}
