package edu.sctu.java.day1021;

import java.util.List;

public interface StudentDB {

    void saveStudent(String name,int age,String gender,int sno);
    void saveStudent(Student student);
    void saveStudent(List<Student> studentList);

    List<Student> query();

    String update(Student student);

    void deleteByid(int id);
}
