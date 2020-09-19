package edu.sctu.java.实验一;

import java.util.Scanner;

//6、	编程输入学生的学习成绩的等级，给出相应的成绩范围。设A级为85分以上（包括85）；B级为70分以上（包括70分）；C级为60分以上（包括60分）；D级为60分以下。
public class test6 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int grades = Scan.nextInt();

        if (grades>=85 && grades <=100){
            System.out.println("A");
        }else if (grades>=70 && grades <85){
            System.out.println("B");
        }else if (grades >=60 && grades <70){
            System.out.println("C");
        }else if(grades<60 && grades >=0){
            System.out.println("D");
        }else {
            System.out.println("数据输入有误");
        }

    }


}
