package edu.sctu.java.day1007;

import java.util.Scanner;

public class StudentA {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("输入计算机成绩：");
        int a=input.nextInt();
        System.out.print("输入数学成绩：");
        int b=input.nextInt();
        System.out.print("输入英语成绩：");
        int c=input.nextInt();
        input.close();
        System.out.println("StudentA的总分："+(a+b+c));
        System.out.println("StudentA的平均分："+(a+b+c)/3);
        int max=a;
        max=max>b ? max:b;
        max=max>c ? max:c;
        System.out.println("StudentA的最高分："+max);
        int min=a;
        min=min<b ? min:b;
        min=min<c ? min:c;
        System.out.println("StudentA的最低分："+min);
    }
}
