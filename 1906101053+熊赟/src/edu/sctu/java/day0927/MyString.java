package edu.sctu.java.day0927;

public class MyString {
    public static void main(String[] args) {
        String jiang = new String("Hello,World!");
        char c = jiang.charAt(2);
        System.out.println(c);

        int n = jiang.length();
        System.out.println(n);

        String b = "你好！";
        String a = jiang.concat(b);
        System.out.println(a);
    }


}
