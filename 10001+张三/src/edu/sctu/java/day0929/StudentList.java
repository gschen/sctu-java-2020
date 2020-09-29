package edu.sctu.java.day0929;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    public static void main(String[] args) {
        List<Student> studentList= new ArrayList<Student>();

        Student hu=new Student();
        hu.name="hu";

        studentList.add(hu);

        for(Student p:studentList){
            System.out.println(p.name);


        }
    }
}
