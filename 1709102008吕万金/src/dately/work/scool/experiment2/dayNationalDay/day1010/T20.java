package dately.work.scool.experiment2.dayNationalDay.day1010;


import java.util.Scanner;

public class T20 {
    public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    System.out.println("请输入字符：");
    String a = input.next();
    System.out.println(a.replaceAll("\\D",""));
}
}

