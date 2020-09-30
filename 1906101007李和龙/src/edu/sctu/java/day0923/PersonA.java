package edu.sctu.java.day0923;

public class PersonA implements PersonAction{
    @Override
    public void run() {
        System.out.println("他在跑步");
    }

    @Override
    public void sleep() {
        System.out.println("他在睡觉");

    }

    public static void main(String[] args) {
        PersonAction zhou = new PersonA();
        zhou.sleep();
    }
}
