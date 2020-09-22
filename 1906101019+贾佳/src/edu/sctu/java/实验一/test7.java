package edu.sctu.java.实验一;

import java.util.Random;
import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        Random r = new Random();
        int guess_number = r.nextInt(100);
        Scanner input = new Scanner(System.in);
        System.out.println("输入一个整数");


        while (true){
            int number = input.nextInt();
            if (number>=0 && number <=100){
            if (number > guess_number){
                System.out.println("猜大了");

            }else if(number <guess_number){
                System.out.println("猜小了");

            }
            else {
                System.out.println("猜对了");
                break;
                }
            }else{
                System.out.println("输入数据有误");
            }
        }
    }
}
