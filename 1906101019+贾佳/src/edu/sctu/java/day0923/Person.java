package edu.sctu.java.day0923;

public class Person  implements PersonAction{

    @Override
    public void study() {
        System.out.println("普通人study....");
    }

    @Override
    public void sleep() {
        System.out.println("sleep...");
    }

    @Override
    public void programming() {
        System.out.println("programing");
    }
}
