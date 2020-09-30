package edu.sctu.java.day0923;

public class Student extends Person{

    @Override
    void rest(){
        System.out.println("在上课，不可以休息！");
    }

    void work(int age){
        System.out.println("学生在这个"+age+"岁都要学习");
    }

    private void study() {
    }
}
