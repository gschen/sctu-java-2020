package edu.sctu.java.day0923;

public class Client {
    public static void main(String[] args) {
        Person jiang = new Person();
        jiang.study();
        jiang.eat();
        jiang.sleep();

        PersonAction p = new Person();
        p.eat();

    }
}
