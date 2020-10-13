package edu.sctu.java.实验二.Test7;

public class Student extends Person{
    int StudentID;
    String SchoolLocation;
    @Override
    String getInfo(){
        System.out.println(super.getInfo());
        String SID = String.valueOf(StudentID);
        return SID + SchoolLocation;
    }
}
