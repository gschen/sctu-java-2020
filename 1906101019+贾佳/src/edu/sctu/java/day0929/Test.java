package edu.sctu.java.day0929;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        Person per = new Person();
//        Person [] pers = new Person[3];
//
//        for (int i = 0; i < 3; i++) {
//            pers[i] = new Person();
//        }
//        pers[0].name = "Keen";
//        pers[1].name = "John";
//        pers[2].name  = "Jack";
//        System.out.println(pers[0].name);
        List<Integer>arr = new ArrayList<Integer>();
        arr.add(1);
        System.out.println(arr);

        List<Person> personList = new ArrayList<Person>();

        Person j = new Person();
        j.name = "Jia";
        personList.add(j);//ctrl+d
        personList.add(j);
        personList.add(j);
        personList.add(j);
        personList.add(j);
//        personList.remove(j);
        for(Person p : personList){
            System.out.println(p.name);
        }

    }
}
