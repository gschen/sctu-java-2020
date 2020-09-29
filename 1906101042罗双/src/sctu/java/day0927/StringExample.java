package sctu.java.day0927;

import java.util.SplittableRandom;

public class StringExample {

    public static void main(String[] args) {

        String name = new String("hello,world!");

        char c = name.charAt(0);//返回指定索引处的字符

        int b = name.length();//字符串长度

        String a = name.intern();





        System.out.println(c);
        System.out.println(b);
        System.out.println(a);

    }
}
