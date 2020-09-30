package edu.sctu.java.day0923;

public class Client {
    public static void main(String[] args) {
        Teacher chen = new Teacher();
        chen.study();

        chen=new Student1();
        chen.study();
/*
        //向上自动转型
        Teacher chen= new Student2();
        chen.study();

 */

        /*
        Student1 B=(Student1) new Teacher();//向下转型

         */
    }
}
