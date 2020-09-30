package edu.sctu.java.day0929;

import java.util.ArrayList;

import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {

        List<Person> personlist = new java.util.ArrayList<Person>();

        Person p = new Person();

        p.name = "lan";

        personlist.add(p);
        personlist.add(p);
        personlist.add(p);
        personlist.add(p);

        for (Person i :
                personlist) {
            System.out.println(i.name);
        }
    }
}
