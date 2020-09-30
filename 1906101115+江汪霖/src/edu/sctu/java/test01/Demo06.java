package edu.sctu.java.test01;

import java.util.Scanner;
public class Demo06 {
    public static void main(String[] args) {
        System.out.println("输入学生成绩:");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if (a < 60)
            System.out.println("D");
        if (60 <= a && a < 70)
            System.out.println("C");
        if (70 <= a && a < 85)
            System.out.println("B");
        if (a >= 85)
            System.out.println("A");

    }
}

