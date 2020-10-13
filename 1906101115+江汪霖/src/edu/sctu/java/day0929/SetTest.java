package edu.sctu.java.day0929;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

    public static void main(String[] args) {

        Set<Person> personSet = new HashSet<Person>();      //不允许添加相同的

        Person jiang = new Person();
        Person aaa = new Person();
        jiang.name = "wang";
        aaa.name = "lin";

        personSet.add(jiang);
        personSet.add(jiang);
        personSet.add(aaa);
        personSet.remove(aaa);

        System.out.println(personSet.size());


        for (Person p : personSet){
            System.out.println(p.name);
        }
    }
}
