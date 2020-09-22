package edu.sctu.java.day0915;

public class Client {
    public static void main(String[] args) {
//        Person chen = new Person();
//        chen.name = "chen";
//        chen.age = 18;
        Person chen = new Person("chen", 18);
        chen.study();
        System.out.println(chen.name);
    }
}
