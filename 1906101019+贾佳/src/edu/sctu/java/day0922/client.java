package edu.sctu.java.day0922;

public class client {


    private static Object Person;

    public static void main(String[] args) {
        Person per = new Student();
        per.eat();

        per.sleep();

        per = new Worker();

        per.sleep();
        per = new Doctor();
        per.sleep();

        //向上转型
        Student c = new Student();
        Person a = c;

        Person aa = new Student();
        //向下转型

        Student std = (Student) aa;

        std.sleep();

    }
}
