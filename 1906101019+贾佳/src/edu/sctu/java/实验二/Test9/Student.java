package edu.sctu.java.实验二.Test9;

public class Student {
    private String name;
    private String gender;
    private int age;
    private int classNo;
    private int StudentNum;
    Student(String name,String gender,int age,int classNo,int StudentNUm){
        this.age = age;
        this.name = name;
        this.gender =gender;
        this.classNo = classNo;
        this.StudentNum = StudentNUm;
    }
    Student(){

    }
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public int getClassNo() {
        return classNo;
    }

    public int getStudentNum() {
        return StudentNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setClassNo(int classNo) {
        this.classNo = classNo;
    }

    public void setStudentNum(int studentNum) {
        StudentNum = studentNum;
    }

    public String toString(){
        String claNo = String.valueOf(this.classNo);
        String age = String.valueOf(this.age);
        String stdNo = String.valueOf(this.StudentNum);
        return claNo+age+stdNo+this.gender+this.name;
    }
}
