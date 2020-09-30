package edu.sctu.java.day0923;

public class Student {

    void study(){
        System.out.println("我在学习");
    }

    void study(String who){
        System.out.println(who+"在学习");
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.study();
    }
}
