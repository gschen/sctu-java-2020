package sctu.java.day0927;

import java.util.SplittableRandom;

public class StringExample {

    public static void main(String[] args) {

        String name = new String("hello,world!");
        char c = name.charAt(0);

        int b = name.length();

        int a = name.codePointCount(2,5);

        System.out.println(c);
        System.out.println(b);
        System.out.println(a);
    }
}
