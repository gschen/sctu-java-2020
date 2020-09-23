package edu.sctu.java.day0923;

public class Person implements PersonAction{
    @Override
    public void study() {
        System.out.println("我在学习");
    }

    @Override
    public void eat() {
        System.out.println("我在吃东西");
    }

    @Override
    public void sleep() {
        System.out.println("我在睡觉");
    }
}
