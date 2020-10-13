package edu.sctu.java.第一次实验;

import java.util.Scanner;

public class K {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个1-9999的数：");
        int n = scanner.nextInt();
        if ( n/1000== n%10 && n/100%10==n/10%10) {
            System.out.println(n+"是回文数");
        }
        else if (n/100==n%10) {
            System.out.println(n+"是回文数");
        }
        else if (n%10==n) {
            System.out.println(n+"是回文数");
        }
        else{
            System.out.println(n+"不是回文数");
        }
    }

}

