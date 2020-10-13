package edu.sctu.java.实验二.Test30;

import java.util.Scanner;

public class arrlis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] lis = new int[3];
        int sum=0;
        for (int i = 0; i < lis.length; i++) {
            lis[i] = input.nextInt();
            sum+=lis[i];
        }
        System.out.println(sum/lis.length);
    }
}
