package edu.sctu.java.day0923;

public class client2 {
    public static void main(String[] args) {
        PersonAction chen = new Person();
        chen.sleep();
        PersonAction zz = new Developer();
        zz.study();

        PersonAction zhen = new Worker();
        zhen.sleep();
    }
}
