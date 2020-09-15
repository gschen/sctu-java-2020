package edu.sctu.java.day0915;

public class Client {
    public static void main(String[] args) {
        System.out.println("hello,world");
        Doc Dr = new Doc();
        Dr.age = 20;
        Dr.name = "Mike";
        Dr.Position = "医生";
        Dr.CheckForPatient();

    }

    int add(int a ,int b){
        int c;
        c= a+ b;
        return c;
    }
}
