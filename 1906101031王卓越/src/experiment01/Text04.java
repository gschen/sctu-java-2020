package experiment01;

import java.util.Scanner;
public class Text04 {
    public static int method1(int n){
        int sums = 0;
        for (int i=0; i<=n; i++){
            sums += i;
        }
        return sums;
    }
    public static int method2(int n){
        int sums = 0;
        int i = 0;
        while (i<=100){
            sums += i;
            i++;
        }
        return sums;
    }
    public static int method3(int n){
        int sums = 0;
        int i = 0;
        do {
            sums += i;
            i++;
        }while (i<=100);
        return sums;
    }

    public static void main(String[] args) {
        Text04 s = new Text04();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(n);
        int a = s.method1(100); 
        int b = s.method2(100);
        int c = s.method3(100);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
