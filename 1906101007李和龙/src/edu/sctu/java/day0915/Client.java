package edu.sctu.java.day0915;



public class Client {
    public static void main(String[] args) {
        Person chen = new Person();
        chen.name = "chen";
        chen.age = 18;

        chen.study();

        Person li = new Person( "li",18 );
        li.study();
    }
}
