package edu.sctu.java.第一次实验;

public class H {
    public static void main(String[] args) {
        for (int a = 1;a <= 9;a++){
            for (int b = 1;b <= a;b++){
                System.out.println(b+"*"+a+"="+(b*a));
            }
            System.out.println();
        }
    }
}
