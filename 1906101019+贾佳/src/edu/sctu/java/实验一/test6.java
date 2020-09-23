package edu.sctu.java.实验一;

import java.util.Scanner;

//6、	编程输入学生的学习成绩的等级，给出相应的成绩范围。设A级为85分以上（包括85）；B级为70分以上（包括70分）；C级为60分以上（包括60分）；D级为60分以下。
import java.io.IOException;

public class test6 {
    public static void main(String[] args) throws IOException {
        char a;
        a =(char)System.in.read();
        String s = String.valueOf(a);
        switch (s){
            case "A" :
                System.out.println("85分以上（包括85）");
                break;
            case "B" :
                System.out.println("70分以上（包括70分）");
                break;
            case "C" :
                System.out.println("60分以上（包括60分）");
                break;
            case "D" :
                System.out.println("60分以下");
                break;

        }

    }
}