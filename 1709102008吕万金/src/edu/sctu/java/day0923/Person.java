package edu.sctu.java.day0923;

public class Person implements PersonAction{//alt+ enter
    String name;
    int age;

    @Override
    public void study() {
        System.out.println("普通人在学习。");
    }

    @Override
    public void play() {

    }

    @Override
    public void work() {

    }

    @Override
    public void pick() {

    }

    @Override
    public void text() {

    }
}
