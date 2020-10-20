package edu.sctu.java.第一次实验;

import java.util.Scanner;

public class G {
    public static void main(String[] args){
        int n=(int)(1+100*Math.random());
        Scanner scanner = new Scanner(System.in);
        for (;;) {
            System.out.println("请输入任意数：");
            int m= scanner.nextInt();
            if (m < n) {
                System.out.println("猜小了");
                continue;
            } else if (m > n) {
                System.out.println("猜大了");
                continue;
            } else {
                System.out.println("猜对了");
                break;
            }
        }
    }
}
