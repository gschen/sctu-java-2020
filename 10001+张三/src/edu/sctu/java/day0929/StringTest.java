package edu.sctu.java.day0929;

public class StringTest {

    public static void main(String[] args) {

        String s = new String("hello");
        //连接字符串
        System.out.println(s.concat("world"));
        //求字符串长度
        System.out.println(s.length());
        //取字符串第多少位
        System.out.println(s.charAt(1));

    }
}

