package edu.sctu.java.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test1 {

    public static void main(String[] args) throws IOException {

        ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("data/person.bin")
        );

        Person person = new Person();
        person.name = "chen";

        outputStream.writeObject(person);
    }
}
