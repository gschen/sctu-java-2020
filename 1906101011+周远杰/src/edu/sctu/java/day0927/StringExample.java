package edu.sctu.java.day0927;

public class StringExample {

    public static void main(String[] args){

        //String no ="123456";
        String name = new String("Hello,World");
        char c=name.charAt(0);

        String m=name.toUpperCase();
        String n=name.toLowerCase();
        System.out.println(m+","+n);

        String b = name.replace('o','e');
        System.out.println(b);

        int a = name.codePointAt(5);
        System.out.println(a);

        String d = name.replace("ello","ow");
        System.out.println(d);

    }
}
