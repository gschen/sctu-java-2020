package edu.sctu.java.day0927;

public class PersonTest {
    public static void main(String[] args) {

        Person chen = new Person();
        chen.age = 10;
        chen.name = "chen";

        // 数组
        int a = 1;

        // int数组
        int[] ints = new int[5];
        ints[0] = 1;
        ints[1] = 2;
        //...
        ints[4] = 5;

        String[] names = new String[3];

        // 3个人的数组,3个Person, 不是3个String
        Person[] persons = new Person[3];

        persons[0] = new Person();
        persons[0].name = "a";

        persons[1] = new Person();
        persons[1].name = "b";

        persons[2] = new Person();
        persons[2].name = "c";

//        for (int i = 0; i < 3; i++) {
//            persons[i] = new Person();
//        }


//        for (int i = 0; i < 3; i++) {
//            persons[i] = new Person();
//        }


        System.out.println("hello,world!");
        System.out.println("hello,world!");
        System.out.println("hello,world!");
        System.out.println("hello,world!");
        System.out.println("hello,world!");
        System.out.println("hello,world!");

        for (int i = 0; i < 100; i++) {
            System.out.println("hello,world!");
        }


    }
}
