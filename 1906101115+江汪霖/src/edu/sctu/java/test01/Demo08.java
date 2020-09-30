package edu.sctu.java.test01;

public class Demo08 {
    public static void main(String[] args) {
        int n = 9;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j + "*" + i + "="+ (j*i) +"\t");

            }
            System.out.println();

        }
    }
}
