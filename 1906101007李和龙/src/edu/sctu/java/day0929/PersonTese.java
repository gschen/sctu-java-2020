package edu.sctu.java.day0929;

import java.util.ArrayList;
import java.util.List;

public class PersonTese {
    public static void main(String[] args) {

        //task1
        Person[] tenPesons = new Person[10];

        //task2
        Person[] twPersons = new Person[20];


        List<Person> personList = new ArrayList<Person>();

        Person chen = new Person();
        chen.name = "chen";

        personList.add(chen);
        personList.add(chen);
        personList.add(chen);
        personList.add(chen);

        for (Person p : personList) {
            System.out.println(p.name);
        }


    }
}
