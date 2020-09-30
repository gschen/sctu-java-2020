package edu.sctu.java.day0927;

public class Client {

    public static void main(String[] args) {
//        int[]  ages = new int[3];
//        String[] names = new String[3];
//        ages[0] = 10;
//        ages [1] = 20;
//        ages [2] = 30;
//        names[0] = "li";
//        names[1] = "wang";
//        names[2] = "zhang";


        Person[] persons = new Person[3];


        for (int i = 0;i<3;i++){


        persons[i] = new Person();persons[0].name = "li";persons[0].age = 10;
        persons[1] = new Person();persons[1].name = "wang";persons[1].age = 20;
        persons[2] = new Person();persons[2].name = "zhang";persons[2].age = 30;
        }


    }
}
