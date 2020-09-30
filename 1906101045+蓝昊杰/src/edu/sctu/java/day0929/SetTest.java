package edu.sctu.java.day0929;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

    public static void main(String[] args) {

        Set<Person> personSet = new HashSet<Person>();

        Person p = new Person();

        p.name = "lhj";

        personSet.add(p);
        personSet.add(p);
        personSet.add(p);

        for (Person i:
             personSet) {
            System.out.println(i.name);
        }

    }
}
