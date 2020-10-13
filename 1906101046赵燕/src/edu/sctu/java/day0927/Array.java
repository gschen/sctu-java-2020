package edu.sctu.java.day0927;

public class Array {
    public static void main(String[] args) {
        // int 数组
        int[] ints = new int[3];



        Person[] persons = new Person[3];

        persons[0] = new Person(); //实例化
        persons[0].name = "小明";

        persons[1] = new Person();
        persons[1].name = "小红";

        persons[2] = new Person();
        persons[2].name = "小胡";

        for (int i = 0; i <3 ; i++) {
            persons[i] = new Person();
            System.out.println(persons[1].name);
        }

    }
}

