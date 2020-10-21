package 课堂练习05.java;

import java.util.Random;
import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a = in.nextInt();
        Random random = new Random();
        int select = random.nextInt(38);
        System.out.println(a);
    }
}
