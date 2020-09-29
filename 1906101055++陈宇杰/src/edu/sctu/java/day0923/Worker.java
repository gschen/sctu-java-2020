package edu.sctu.java.day0923;

public class Worker implements PersonAction
{
    String name;
    int age;
    @Override
    public void study() {
        System.out.println("工人正在学习");
    }

    @Override
    public void watch() {

    }

    @Override
    public void run() {

    }

    public static void main(String[] args) {
        Worker chen = new Worker();
        chen.age=18;
        System.out.println();
    }
}
