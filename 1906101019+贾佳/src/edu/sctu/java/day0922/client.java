package edu.sctu.java.day0922;

public class client {
    public static void main(String[] args) {
        Person per = new Student();
        per.eat();

        per.sleep();

        per = new Worker();

        per.sleep();
        per = new Doctor();
        per.sleep();
    }
}
