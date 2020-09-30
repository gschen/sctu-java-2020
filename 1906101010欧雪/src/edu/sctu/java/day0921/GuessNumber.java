package edu.sctu.java.day0921;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        Random random=new Random();
        System.out.println("给你一个1-100之间的整数，请猜这个数");
        int realNumber=random.nextInt(100)+1;
        int youGuess=0;
        System.out.println("输入您的一个猜测：");
        youGuess=reader.nextInt();

        while(youGuess!=realNumber){
            if(youGuess>realNumber){
                System.out.print("猜大了，再输入你的猜测：");
                youGuess=reader.nextInt();
            }
            else if(youGuess<realNumber){
                System.out.print("猜小了，再输入你的猜测：");
                youGuess=reader.nextInt();
            }
        }
    }
}
