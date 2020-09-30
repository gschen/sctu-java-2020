package day0929下;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        String s=sr.next();
        while (!s.equals("q")){
            switch (s) {
                case "u" -> System.out.println("向上");
                case "d" -> System.out.println("向下");
                case "l" -> System.out.println("向左");
                case "r" -> System.out.println("向右");
                default -> System.out.println("输入错误，请重新输入");
            }
            Scanner sr2=new Scanner(System.in);
            s=sr2.next();

        }
        System.out.println("退出");
    }
}
