package edu.sctu.java.day0915;

public class Client{
    public static void main(String[] args) {
        System.out.println("hello,world");
        Doc Dr = new Doc("Mike",20);
        System.out.println(Dr.name);
        System.out.println(Dr.age);
        Dr.CheckForPatient();

        Student std = new Student();
        std.name="Jack";
        std.study();
    }

    int add(int a ,int b){
        int c;
        c= a+ b;
        return c;
    }
}
