package edu.sctu.java.test;

import java.io.*;

public class Test2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


        ObjectInputStream is = new ObjectInputStream(
                new FileInputStream("data/person.bin")
        );

        Person o = (Person)is.readObject();

        System.out.println(o.name);
    }
}
