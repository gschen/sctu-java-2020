package edu.sctu.java.第二次实验;


//字符串基本操作方法
public class Person {
    public static void main(String[] args) {

        String str = "定义一个字符串";

        //输出字符串
        System.out.println(str);

        //得到字符串长度
        int length = str.length();
        System.out.println("字符串的长度为：" + length);

        //得到索引为N的字符
        char ch = str.charAt(6);
        System.out.println("字符串中的第7个字符为：" + ch);

        //定义容量为m的字符数组，用于存储从字符串中提取出的一串字符
        char chardst[] = new char[30];
        str.getChars(0,5,chardst,0);
        System.out.println(chardst); //**括号中不能带其他字符串
    }
}
