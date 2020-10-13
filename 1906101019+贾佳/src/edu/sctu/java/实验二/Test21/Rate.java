package edu.sctu.java.实验二.Test21;

import java.util.Scanner;

public class Rate {
    public static void main(String[] args) {
        String LongStr;
        String  ShortStr;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入字符");
        LongStr = input.next();
        System.out.println("请输入字串");
        ShortStr = input.next();
        System.out.println(getNum(LongStr,ShortStr));
    }
    public static int getNum(String Long, String  Short){
        int count = 0;
        char[] arr = Long.toCharArray();
        char[] shor = Short.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(shor[0] == arr[i]){
                count++;
            }
        }
        return count;
    }
}
