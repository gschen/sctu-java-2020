package edu.sctu.java.Day0927;

import edu.sctu.java.Day0923.Person;

import java.util.Arrays;

public class PersonTest {
    int age;
    String name;
    public static void main(String[] args) {
        PersonTest yang = new PersonTest();
        yang.age = 18;
        yang.name = "yang";

        //数组

        //整型数组
        int[] ints = new int[5];
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 3;
        ints[3] = 4;
        ints[4] = 5;

        String[] strings = new String[3];
        strings[0] = "yang";
        strings[1] = "lan";
        strings[2] = "li";
        System.out.println(Arrays.toString(strings));
        for (int i = 0;i<strings.length;i++){
            System.out.println(strings[i]+",");
        }

        PersonTest[] persontest = new PersonTest[3];
        for (int i=0;i<3;i++){
            persontest[i] = new PersonTest();
        }
        persontest[0].name = "a";
        persontest[1].name = "b";
        persontest[2].name = "c";

    }
}
