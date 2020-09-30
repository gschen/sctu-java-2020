package edu.sctu.java.day0929;

import java.util.HashSet;
import java.util.Set;

public class StudentSet {

    public static void main(String[] args) {

        Set<Student> studentSet = new HashSet<Student>();
        Student wang = new Student();
        wang.name = "wang";

        studentSet.add(wang);
        studentSet.add(wang);
        studentSet.add(wang);
        studentSet.add(wang);


        for (Student p :studentSet){

            System.out.println(p.name);
        }

    }
}


