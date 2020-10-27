package edu.sctu.java.day1021;

import java.util.List;

public interface StudentDB {

    // CRUD
    void saveStudent(Student student);
    void saveStudents(List<Student> studentList);

    void query();

    List<Student> queryAll();

    List<Student> queryBySno(String sno);




    void update(Student student);

    void deleteById(int id);

}
