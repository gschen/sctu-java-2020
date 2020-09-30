package dately.work.scool.experiment1.day0916;

import java.util.Random;
import java.util.Scanner;

public class R7 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(100);

        Scanner guessnum = new Scanner(System.in);

        while (true) {
            int guess = guessnum.nextInt();
            if (guess == num) {
                System.out.println("猜对了");
                break;
            } else if (guess < num) {
                System.out.println("猜小了");
            } else if (guess > num) {
                System.out.println("猜大了");
            }
        }
    }
}
