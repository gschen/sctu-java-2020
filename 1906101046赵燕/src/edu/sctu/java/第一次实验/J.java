package edu.sctu.java.第一次实验;

public class J {
    public static void main(String[] args) {
        int number=0;
        for (int i = 2; i <= 100; i++) {
            boolean m = true;
            for (int j = 2; j <i; j++) {
                if (i % j == 0) {
                    m = false;
                    break;
                }
            }
            if (m) {
                System.out.print(i + " ");
                number++;
                if (number % 5 == 0) {
                    System.out.println();
                }
            }
        }
    }
}

