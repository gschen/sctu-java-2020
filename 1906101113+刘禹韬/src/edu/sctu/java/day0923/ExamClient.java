package edu.sctu.java.day0923;

public class ExamClient {

    public static void main(String[] args) {

        Exam t1 = new Exam();
        t1.point();

        t1 = new EnExam();
        t1.point();

        t1 = new CnExam();
        t1.point();


    }
}
