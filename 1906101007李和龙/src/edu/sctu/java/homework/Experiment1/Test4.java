package edu.sctu.java.homework.Experiment1;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        //for方法
        int sum1 = 0;

        for (int a = 1;a<=n;a++){
            sum1 = sum1 + a;
        }
        System.out.println(sum1);

        //while方法
        int b = 0;
        int sum2 = 0;
        while (b<n){
            b++;
            sum2 = sum2 + b;
        }
        System.out.println(sum2);

        //do while方法
        int c = 0;
        int sum3 = 0;
        do {
            c++;
            sum3 = sum3 + c;
        }while (c<n);
        System.out.println(sum3);
    }
}
