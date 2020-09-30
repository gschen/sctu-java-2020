package edu.sctu.java.day0929;

import java.util.ArrayList;
import java.util.List;

public class ListClient {

    public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<Dog>();

        Dog d1 = new Dog();
        d1.name = "阿黄";

        dogs.add(d1);
        dogs.add(d1);
        dogs.add(d1);

        for (Dog n: dogs){
            n.woof();

        }


    }

}
