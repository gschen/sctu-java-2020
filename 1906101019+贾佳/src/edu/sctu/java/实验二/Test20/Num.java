package edu.sctu.java.实验二.Test20;
import java.util.Scanner;
public class Num {

    //java.util.Scanner的使用

    public static void main(String args[]) {
            Scanner input = new Scanner(System.in);
            System.out.println("请输入字符：bai");

                String a = input.next();
        //把字符串中的非du数字全部替换为"" 打印
                System.out.println(a.replaceAll("\\D",""));


        }

}
