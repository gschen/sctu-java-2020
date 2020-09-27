package edu.sctu.java.Day0923;

public class Client {
    public static void main(String[] args) {

        PersonAction a = new Person();
        a.eat();
        a.run();
        a.study();

        PersonAction b = new Worker();
        b.eat();
        b.study();
        b.run();

        PersonAction c = new Developer();
        c.eat();
        c.run();
        c.study();

    }
}
