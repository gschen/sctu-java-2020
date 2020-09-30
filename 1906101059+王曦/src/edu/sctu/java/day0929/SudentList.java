package edu.sctu.java.day0929;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SudentList {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<Student>();

        Student wang = new Student();
        wang.name = "wang";


        studentList.add(wang);
        studentList.add(wang);
        studentList.add(wang);
        studentList.add(wang);




        for (Student p :studentList){
            System.out.println(p.name);

        }


    }








}
