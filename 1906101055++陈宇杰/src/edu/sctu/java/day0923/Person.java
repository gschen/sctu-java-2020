package edu.sctu.java.day0923;

import jdk.swing.interop.SwingInterOpUtils;

public class Person implements PersonAction {
    String name;
    int age;


    @Override
    public void study() {
        System.out.println("普通人正在学习");
    }

    @Override
    public void watch() {

    }

    @Override
    public void run() {

    }

    @Override
    public void eat() {

    }
}
