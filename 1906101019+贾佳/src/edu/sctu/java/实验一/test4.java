package edu.sctu.java.实验一;

import java.util.Scanner;

//4、	分别用 for 语句、while 语句以及 do while 语句编写一个求和程序（即 sum=1+2+3+...+n）。
public class test4 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int n = Scan.nextInt();
        int c = 0;
        for(int i = 1;i<=n;i++){
            c += i;

        }System.out.println(c);
        int a = 1;
        int x = 0;
        while (a<=n){
            x += a;
            a++;


        }
        System.out.println(x);
        int b = 1;
        int k = 0;
        do {
            k +=b;
            b++;
        }while (b<=n);
        System.out.println(k);

    }
}
