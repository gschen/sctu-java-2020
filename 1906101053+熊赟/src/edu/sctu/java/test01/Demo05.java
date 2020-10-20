package edu.sctu.java.test01;

import java.util.Scanner;
public class Demo05 {
    public static void main(String[] args) {
        System.out.println("输入n:");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        switch (n){
            case 1:
                System.out.println("不及格");
            case 2:
                System.out.println("及格");
            case 3:
                System.out.println("中等");
            case 4:
                System.out.println("良好");
            case 5:
                System.out.println("优秀");

        }
    }
}

