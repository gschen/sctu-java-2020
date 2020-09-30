package edu.sctu.java.day0929;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<Person> personSet = new HashSet <Person>();

        Person li = new Person();
        li.name = "li";

        personSet.add(li);
        personSet.add(li);
        personSet.add(li);
        personSet.add(li);

        for (Person p : personSet) {
            System.out.println(p.name);
        }
    }

}
