package edu.sctu.java.day0929;

import edu.sctu.java.day0929.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonTest01 {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<Person>();

        Person jiang = new Person();
        jiang.name = "wang" ;

        personList.add(jiang);
        personList.add(jiang);
        personList.add(jiang);
        personList.add(jiang);
        personList.add(jiang);
        personList.add(jiang);
        personList.add(jiang);
        personList.add(jiang);

        for (Person p : personList){
            System.out.println(p.name);
        }

    }
}
