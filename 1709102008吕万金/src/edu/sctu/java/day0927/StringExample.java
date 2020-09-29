package edu.sctu.java.day0927;

public class StringExample {
    public static void main(String[] args) {
        String name=new String("hello,world!");
        int n=name.length();
        System.out.println(n);
        String k=name.replace(",","!");
        System.out.println(k);
        char x=name.charAt(4);
        System.out.println(x);


    }
}
