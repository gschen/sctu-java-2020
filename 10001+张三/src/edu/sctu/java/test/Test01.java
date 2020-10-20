package edu.sctu.java.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test01 {

    public static void main(String[] args) {

        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(
                    new FileInputStream("data/person.bin")
            );

            Person p = (Person) objectInputStream.readObject();

            System.out.println(p.name);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
