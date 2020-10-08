package edu.sctu.java.day0927;

public class PersonTest {
    public static void main(String[] args) {

        //数组
        int  a = 1;
        //int数组
        int[] ints = new int[5];
        ints [0] = 1;
        ints [1] = 2;
        ints [2] = 3;
        ints [3] = 4;
        ints [4] = 5;

        //三个人的数组
        Person[] persons = new Person[3];



        for(int i=0;i<3;i++){
            persons[i]= new Person();
        }

        //        persons[0] = new Person();
        persons[0].name = "chen";
//        persons[1] = new Person();
        persons[1].name = "li";
//        persons[2] = new Person();
        persons[2].name = "zhao";

        System.out.println(persons[1].name);;






    }
}
