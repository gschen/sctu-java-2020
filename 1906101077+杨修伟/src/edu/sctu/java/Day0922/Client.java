package edu.sctu.java.Day0922;

public class Client {

    public static void main(String[] args) {

        Father yang  = new Father();
        yang.say();

        Father cc = new Son();
        cc.say();
        //cc.eat();

        Son ccc = new Son();
        ccc.eat();
        ccc.say();

    }
}
