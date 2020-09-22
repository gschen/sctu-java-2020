package edu.sctu.java.实验一;
//九九乘法表
public class test8 {
    public static void main(String[] args) {


        for (int i = 1; i < 10; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(j + "*" + i + "=" + j * i + "\t");
            }

            System.out.println();

        }
    }
}
