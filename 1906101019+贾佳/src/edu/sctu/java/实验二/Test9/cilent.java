package edu.sctu.java.实验二.Test9;

public class cilent {
    public static void main(String[] args) {
        Student std = new Student();
        std.setAge(10);
        std.setClassNo(10);
        std.setGender("male");
        std.setName("John");
        std.setStudentNum(100);
        System.out.println(std.toString());
    }
}
