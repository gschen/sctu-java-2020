package edu.sctu.java.day0922;

public class Student extends Person {
    //@Override重写

    @Override//注解 annotation
    void study() {
        super.study();
        System.out.println("学生正在学习");
    }
//ctrl+x 快速删除代码
    public static void main(String[] args) {
        Student chen = new Student();
        chen.study();
    }
}
