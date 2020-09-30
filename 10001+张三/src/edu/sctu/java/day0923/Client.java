package edu.sctu.java.day0923;

import edu.sctu.java.day0922.Person;

public class Client {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();

        a = new Cat();
        a.eat();

        a = new Dog();
        a.eat();

        Animal b = new Dog(); //向上转型,自动

        Dog d = (Dog) new Animal(); // 向下转型，强制的

        Cat c = (Cat) new Animal();

        b = new Cat();


//        Animal a = new Animal();
//        a.name = "aaa";
//
//        Animal b;
//        b.name = "bbb";



    }
}
