package edu.sctu.java.test01;

import java.util.Scanner;
public class Demo04 {
    public static void main(String[] args) {
        System.out.println("输入n:");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        int i = 1;
        do {
            sum += i;
            i++;
        }while (i<=n);
        System.out.println(sum);
    }
}

