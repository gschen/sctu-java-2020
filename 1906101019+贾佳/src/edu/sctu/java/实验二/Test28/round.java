package edu.sctu.java.实验二.Test28;

import java.util.InputMismatchException;
import java.util.Scanner;

public class round {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            double bj = input.nextDouble();
        }catch (InputMismatchException i ){
            System.out.println("输入类型有误");
        }

    }
}
