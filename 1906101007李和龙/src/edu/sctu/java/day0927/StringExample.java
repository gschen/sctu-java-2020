package edu.sctu.java.day0927;

public class StringExample {
    public static void main(String[] args) {
        String name = new String("hello,world");

        char a = name.charAt(4);
        System.out.println(a);

        int b = name.length();
        System.out.println(b);

        String c = name.toString();
        System.out.println(c);

        int d  = name.codePointAt(3);
        System.out.println(d);

        String e = name.replace("hello,w","a");
        System.out.println(e);

        String f =  name.repeat(5);
        System.out.println(f);
        String g = name.toUpperCase();
        System.out.println(g);
    }
}
