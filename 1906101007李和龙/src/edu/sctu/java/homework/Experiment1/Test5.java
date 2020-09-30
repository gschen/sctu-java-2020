package edu.sctu.java.homework.Experiment1;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner grade = new Scanner(System.in);
        int a = grade.nextInt();
        //if-else 语句
        if (a==1){
            System.out.println("不及格");
        }
        else if (a==2){
            System.out.println("及格");
        }
        else if(a==3){
            System.out.println("中等");
        }
        else if(a==4){
            System.out.println("良好");
        }
        else if(a==5){
            System.out.println("优秀");
        }


//        switc结构
        switch (a){
            case 1 :
                System.out.println("不及格");
                break;
            case 2 :
                System.out.println("及格");
                break;
            case 3 :
                System.out.println("中等");
                break;
            case 4 :
                System.out.println("良好");
                break;
            case 5 :
                System.out.println("优秀");
                break;
        }

    }
}
