package edu.sctu.java.homework.Experiment1;

import java.util.Random;
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Random a = new Random();
        int num = a.nextInt(100);

        System.out.println("请输入一个整数：");
        Scanner b = new Scanner(System.in);


        while (true){
            int input = b.nextInt();
            if (input > num){
                System.out.println("猜大了");
            }
            else if (input < num){
                System.out.println("猜小了");
            }
            else if (input == num){
                System.out.println("猜对了");
                break;
            }

        }

    }
}
