package edu.sctu.java.day0929;

import java.util.HashSet;
import java.util.Set;

public class SetClient {

    public static void main(String[] args) {

        Set<Cat> cats = new HashSet<Cat>();

        Cat c1 = new Cat();
        c1.name = "卷毛";

        cats.add(c1);
        cats.add(c1);
        cats.add(c1);

        for (Cat c : cats){
            c1.eat();
        }


    }


}
