package edu.sctu.java.day0922;

public class Student extends Person{

    @Override  // 注解 annotation 表示子类方法重写了父类的方法
    void study() {
        super.study();

        System.out.println("学生正在学习");
    }

    public static void main(String[] args) {
        Student A = new Student();
        A.study();

    }

}
