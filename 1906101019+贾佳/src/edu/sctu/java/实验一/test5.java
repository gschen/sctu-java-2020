package edu.sctu.java.实验一;

import java.util.Scanner;

//5、	请分别用 if-else 语句和 switch 语句编写能够实现以下功能的程序。
//某同学某门课的成绩可能的结果为1，2，3，4，和5。当成绩为1时请输出不及格；成绩为2时请输出及格；成绩为3时请输出中等；成绩为4时请输出良好；成绩为5时请输出优秀。
public class test5 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int n = Scan.nextInt();

        if (n==1){
            System.out.println("不及格");
        }else if(n==2){
            System.out.println("及格");
        }else if(n==3){
            System.out.println("中等");
        }else if(n==4){
            System.out.println("良好");
        }else if (n==5){
            System.out.println("优秀");
        }else {
            System.out.println("输入数据不合理");
        }
        switch (n){
            case 1:
                System.out.println("不及格");
                break;
            case 2:
                System.out.println("及格");
                break;
            case 3:
                System.out.println("中等");
                break;
            case 4:
                System.out.println("良好");
                break;
            case 5:
                System.out.println("优秀");
                break;
            default:
                System.out.println("输入数据不合理");
                break;
        }

    }
}
