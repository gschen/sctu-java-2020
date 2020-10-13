package edu.sctu.java.day0923;

public class Person implements PersonAction {

    public String name;
    int age;

    @Override
    public void study() {

        System.out.println("普通人正在学习！");
    }

    @Override
    public void play() {

        System.out.println("karry正在玩");

    }
}
