package edu.sctu.java.实验二.Test27;

import java.util.InputMismatchException;
import java.util.Scanner;

public class erro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            int num = input.nextInt();
            System.out.println(num);
        }catch (InputMismatchException i){
            System.out.println("输入的类型有误");
        }

    }
}
