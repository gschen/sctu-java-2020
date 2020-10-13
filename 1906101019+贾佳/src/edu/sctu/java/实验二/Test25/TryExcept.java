package edu.sctu.java.实验二.Test25;

import java.util.Scanner;

public class TryExcept {
    public static void main(String[] args) {
        Scanner inout = new Scanner(System.in);
        int Division1 = inout.nextInt();
        int Division2 = inout.nextInt();
        try {
            int answer = Division1 / Division2;
            System.out.println(answer);
        }catch(ArithmeticException e){
            System.out.println("被除数为0");
        }
        finally {
            System.out.println("correct");
        }
    }
}
