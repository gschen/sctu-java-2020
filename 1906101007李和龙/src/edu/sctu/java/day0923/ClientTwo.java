package edu.sctu.java.day0923;

public class ClientTwo {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();

        a = new  Cat();
        a.eat();

        a = new Dog();
        a.eat();

    }
}