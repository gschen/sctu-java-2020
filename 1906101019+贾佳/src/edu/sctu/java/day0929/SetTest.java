package edu.sctu.java.day0929;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<Person> personSet = new HashSet<Person>();
        Person j = new Person();
        j.name = "Jia";

        personSet.add(j);
//        personSet.remove(j);
        personSet.clear();
        System.out.println(personSet.contains(j.name));
//        for (Person p : personSet){
//            System.out.println(p.name);
//        }
    }
}
