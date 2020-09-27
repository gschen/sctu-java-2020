package edu.sctu.java.day0922;

public class Client1 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        a.go();

        a = new Bird();
        a.eat();
        a.go();

        a = new Cat();
        a.eat();
        a.go();
    }
}
