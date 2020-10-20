package edu.sctu.java.day0930;

import java.util.HashSet;
import java.util.Set;

public class Client {

    public static void main(String[] args) {

        Set<Cat> set = new HashSet<>();

        Cat bob = new Cat();
        bob.name = "bob";

        set.add(bob);

        for (Cat cat :set){
            System.out.println(cat.name);
        }
    }
}
