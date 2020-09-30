package edu.sctu.java.day0927;

public class StringExample {
    public static void main(String[] args) {
        String name;
        name = "asd";
        char [] array =name.toCharArray();
//        System.out.println(array);

        String na = name.concat("wocao");
        System.out.println(na);

        String up = name.toUpperCase();
//        System.out.println(up);

        String cha = na.replace("o","k");
        System.out.println(cha);
        int len = na.length();
        System.out.println(len);
    }
}
