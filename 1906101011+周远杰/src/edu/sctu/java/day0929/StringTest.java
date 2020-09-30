package edu.sctu.java.day0929;

public class StringTest {
    public static void main(String[] args){
        String str = new String("Hello,world");

        String a = str.toUpperCase();
        System.out.println(a);

        String b = str.replace('o','e');
        System.out.println(b);

        char[] c = str.toCharArray();
        System.out.println(c);
    }
}
