package edu.sctu.java.day0929;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        
        Set<Person> personSet = new HashSet<Person>();

        Person chen = new Person();
        chen.name = "chengs";

        personSet.add(chen);
        personSet.remove(chen);
//        personSet.clear();

        for (Person p : personSet){
            System.out.println(p.name);
        }
    }
}
