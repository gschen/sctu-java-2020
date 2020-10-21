package dately.work.scool.experiment2.dayNationalDay.day1011;

import java.util.Scanner;

public class T25 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        int a = sc1.nextInt();
        int b = sc2.nextInt();

        try{
            System.out.println(a / b);
        }catch(ArithmeticException e){
            System.out.println("除数不能为0");
        }

    }
}
