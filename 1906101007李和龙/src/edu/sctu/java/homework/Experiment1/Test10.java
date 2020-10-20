package edu.sctu.java.homework.Experiment1;

public class Test10 {
    public static void main(String[] args) {
        int i, j,len = 0;
        for (i = 2; i <= 100; i++) {
            for (j = 2; j < i; j++) {
                if (i % j == 0)
                    break;
            }
            if (j >= i){
                len++;
                System.out.print(" "+i);
                if(len%5==0){
                    System.out.println("\n");
                }
            }
        }
    }
}
