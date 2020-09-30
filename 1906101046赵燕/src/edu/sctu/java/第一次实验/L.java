package edu.sctu.java.第一次实验;

public class L {
    public static void main(String[] args) {
        for(int a = 1;a < 10;a++){
            for(int b = 0;b < 10;b++){
                for(int c = 0;c < 10;c++){
                    if(a*a*a+b*b*b+c*c*c==a*10*10+b*10+c){
                        System.out.println(a*10*10+b*10+c);
                    }
                }
            }
        }
    }
}
