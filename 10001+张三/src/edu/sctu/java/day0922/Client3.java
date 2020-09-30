package edu.sctu.java.day0922;

public class Client3 {

    public static void main(String[] args) {
        Father f = new Father();
        f.play();

        f = new Son();
        f.play();

        f = new Daught();
        f.play();
    }
}
