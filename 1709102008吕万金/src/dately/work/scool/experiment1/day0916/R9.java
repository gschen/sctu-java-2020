package dately.work.scool.experiment1.day0916;

import java.util.Scanner;
public class R9 {
    public static void main(String[] args) {
        char s = 'A';
        Scanner input = new Scanner(System.in);
        System.out.println("请输入您要打印的行数:");
        int num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < (num - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i * 2 - 1); j++) {
                System.out.print(s);
                int v = (int) s;
                v++;
                s = (char) v;
            }
            System.out.println();

        }
        for (int i = num - 1; i > 0; i--) {
            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print(s);
                int v = (int) s;
                v++;
                s = (char) v;
            }
            System.out.println();
        }
    }
    }

