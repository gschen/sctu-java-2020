package edu.sctu.java.day0927;

import javax.print.DocFlavor;

public class PersonTest {
    public static void main(String[] args) {

        String name;

        //数组
        int a = 1;

        //int数组
        int[] ints = new int[5];
        ints[0] = 1;
        ints[1] = 2;
        System.out.println(ints[0]);


        String[] Strings = new String[3];
        Strings[0] = "jiang";
        Strings[1] = "wang";
        Strings[2] = "lin";
        System.out.println(Strings[0]);

        //三个人
        Person[] persons = new Person[3];

        persons[0] = new Person();
        persons[0].name = "a";

        persons[1] = new Person();
        persons[1].name = "b";

        persons[2] = new Person();
        persons[2].name = "c";
        System.out.println(persons[0].name);

//        for (int i = 0; i <3 ; i++) {
//            persons[i] = new Person();
//
//        }

    }
}
