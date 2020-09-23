package edu.sctu.java.day0922;

public class ClientTwo {

    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();

        a = new Cat();
        a.eat();

        Animal b = new Cat();
        b.eat();

        a = new Dog();
        a.eat();
    }
}
