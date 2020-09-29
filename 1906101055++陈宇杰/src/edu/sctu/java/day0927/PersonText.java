package edu.sctu.java.day0927;

public class PersonText extends Person {

    public static void main(String[] args) {
        PersonText chen = new PersonText();
        chen.age = 10;
        chen.name = "chen";


        //数组
        int a = 1;

        //int 数组
        int[] ints = new int[5];
        ints[0] = 1;
        ints[1] = 2;
        //.....
        ints[4] = 4;

        //三个人的数组
        Person[] Persons = new Person[3];
        Persons[0] = new Person();
        Persons[0].name= "A";

        Persons[1] = new Person();
        Persons[1].name= "B";

        Persons[2] = new Person();
        Persons[2].name= "C";

       /* for (int i = 0; i<3;i++){
            Persons[i] = new Person();
        }*/
        //消除重复

    }
}
