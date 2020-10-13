package edu.sctu.java.test01;

import java.util.Scanner;
public class Demo07 {
    public static void main(String[] args) {
        int number = (int)(Math.random()*100)+1;

        System.out.println("用户的猜测:");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();

        if (x > number)
            System.out.println("猜大了");
        if (x < number)
            System.out.println("猜小了");
        if (x == number)
            System.out.println("猜对了");
    }

}

