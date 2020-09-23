package edu.sctu.java.day0923;

public class Worker implements PersonAction{
    String no;

    @Override
    public void study() {
        System.out.println("工人正在学习");
    }

    @Override
    public void sleep() {

    }

    @Override
    public void programming() {

    }
}
