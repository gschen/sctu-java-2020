package edu.sctu.java.day1007;


import java.util.Scanner;

public class Circular {
    public static void main(String[] args) {
        System.out.print("请输入半径r=");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        System.out.println("圆的面积："+3.14*a*a);
        System.out.println("圆的周长："+3.14*a*2);

    }
}
