package edu.sctu.java.day0923;

public class Client {
    public static void main(String[] args) {
        PersonAction chen = new Person();
        chen.study();

        PersonAction zz = new Developer();

        PersonAction zhen = new Worker();
        zhen.study();
    }


}
