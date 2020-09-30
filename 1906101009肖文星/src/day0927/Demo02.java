package day0927;

import day0916.Person;

public class Demo02 {
    public static void main(String[] args) {
        String[] name=new String[] {"小明","a","b"};
        for (String s : name) {
            System.out.println(s);
        }

        Person[] persons=new Person[3];
//        persons[0].name="a";
//        persons[1].name="b";
//        persons[2].name="b";



        for (int i=0;i<persons.length;i++){
            System.out.println("a");
        }

    }
}
