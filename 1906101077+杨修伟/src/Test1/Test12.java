package Test1;

import java.util.Scanner;
public class Test12 {
    public static void main(String[] args) {
        for (int i=1;i<=1000;i++){
            int a = i/100 ;
            int b = i%100/10;
            int c = i%10;
            if(i>99 && i<1000) {
                if (a * a * a + b * b * b + c * c * c == i)
                    System.out.println(i);
            }
        }
       


    }
}

