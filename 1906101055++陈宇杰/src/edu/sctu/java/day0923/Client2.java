package edu.sctu.java.day0923;

public class Client2 {
    public static void main(String[] args) {
        PersonAction chen= new Person();
        PersonAction zhen = new Worker();
        chen.run();
        zhen.study();
    }

}
