package edu.sctu.java.实验一;

import java.util.Scanner;

//11、	编写一个Java应用程序。用户从键盘输入一个1-9999之间的数，程序将判断这个数是几位数，并判断这个数是否是回文数。回文数是指将该数含有的数字逆序排列后得到的数和原数相同，例如12121、3223都是回文数。
public class test11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您想输入的字符串：");
        String str = scanner.next();
        char[] hws = str.toCharArray();//将str转换为字符数组

        StringBuilder s = new StringBuilder();
        for (int i = hws.length-1; i >= 0; i--) {
            s.append(hws[i]);
        }
        System.out.println(s);
        if(str.equals(s.toString())){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }
}
