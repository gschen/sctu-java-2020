package edu.sctu.java.day0923;

public class Worker implements PersonAction{
    String name;


    @Override
    public void study() {
        System.out.println("普通人正在学习");
    }

    @Override
    public void play() {

        System.out.println("他正在工作");
    }
 }
