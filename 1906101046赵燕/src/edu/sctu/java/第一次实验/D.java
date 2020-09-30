package edu.sctu.java.第一次实验;

import java.util.Scanner;

//public class D {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int sum = 0;
//        for (int i = 0;i <= n;i++){
//            sum = sum + i;
//        }
//        System.out.println(sum);
//    }
//}


//public class D {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int sum = 0;
//        int i = 0;
//        while (i <= n){
//            sum = sum + i;
//            i++;
//        }
//        System.out.println(sum);
//    }
//}

public class D{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int i = 0;
        do {
            sum = sum + i;
            i++;
        }
        while(i <= n);{
            System.out.println(sum);
        }
    }
}