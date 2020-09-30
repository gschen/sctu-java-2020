package edu.sctu.java.day0923;

public class Client1 {
    public static void main(String[] args){

        PersonAction zhou = new Person1();
        zhou.study();

        PersonAction yuan = new Worker();
        yuan.study();

        PersonAction jie = new Developer();
        jie.study();
    }
}
