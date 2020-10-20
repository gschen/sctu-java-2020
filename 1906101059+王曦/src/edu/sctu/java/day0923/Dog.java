package edu.sctu.java.day0923;

public class Dog implements Aniamlaction {

    @Override
    public void eat() {
        System.out.println("eating");
    }

    @Override
    public void run() {
        System.out.println("runing");
    }

    @Override
    public void sleep() {
        System.out.println("sleeping");
    }
}
