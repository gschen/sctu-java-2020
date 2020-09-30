package edu.sctu.java.day0923;

public class Person implements PersonAction{   //alt + enter
    String name;
    int age;

    @Override
    public void study() {
        System.out.println("study...");

    }

    @Override
    public void play() {
        System.out.println("他正在打游戏");

    }
 }
