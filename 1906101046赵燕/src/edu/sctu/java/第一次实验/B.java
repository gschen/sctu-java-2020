package edu.sctu.java.第一次实验;

public class B {
    public static void main(String[] args) {
        for (int i = 0;i <= 300 ;i++){
            if (i >= 100){
                if (i % 3 ==0){
                    continue;
                }
                System.out.println(i);
            }
        }
    }
}
