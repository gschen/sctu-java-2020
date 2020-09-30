package edu.sctu.java.Day0927;

public class StringExample {
    public static void main(String[] args) {
       // String no = "1231223";
        String name = new String("hello,world!");

        char c = name.charAt(4);
        System.out.println(c);

        int n = name.length();
        System.out.println(n);

        int a = name.codePointCount(2,name.length());
        System.out.println(a);

        boolean b = name.startsWith("h");
        System.out.println(b);

        int d = name.codePointAt(0);
        System.out.println(d);

        System.out.println(name.concat("hahhah"));
    }
}
