package edu.sctu.java.day0922;

public class Client2 {

    public static void main(String[] args) {


        Animal a = new Animal();
        a.eat();


        a = new Bird();
        a.eat();


        a = new Cat();
        a.eat();




        Tree tree = new Tree();
        tree.grow();

        tree = new Fruit();
        tree.grow();

        tree = new Leaf();
        tree.grow();
    }

    }

