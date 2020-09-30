package edu.sctu.java.day0922;

public class Client {

    public static void main(String[] args) {
     Father f = new Father();
     Father s = new Son();
     Son cc = new Son();
     f.eat();
     s.eat();
     cc.eat();
    }
}
