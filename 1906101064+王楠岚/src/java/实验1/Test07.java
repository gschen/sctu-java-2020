package java.实验1;

import java.util.Random;
import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int realNum = rd.nextInt(100)+1;
        while (true){
            int guessNum = sc.nextInt();
            if (guessNum>realNum){
                System.out.println("猜大了");
            }else if(guessNum<realNum){
                System.out.println("猜小了");
            }else {
                System.out.println("猜对了");
                break;
            }
        }
    }
}
