package edu.sctu.java.day0922;

public class Student extends Person{

    @Override // 注解 annotation表示子类方法重写了父类的方法
    void study() {

        System.out.println("学生正在学习.");
    }


    public static void main(String[] args) {
//        Student chen = new Student();
//        chen.study();

//        Person chen = new Person();
//        chen.study();

        Person chen = new Student();
        chen.study();
    }
}
