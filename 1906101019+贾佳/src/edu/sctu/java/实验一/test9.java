package edu.sctu.java.实验一;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class test9 {

    public static void main(String[] args) {
		/*			L	_	字母
			 A		1	3	1			分成4部分 A
		    ABA		2	2	3					 AB 	A
		   ABCBA	3	1	5					ABC		BA
		  ABCDCBA	4	0	7				   ABCD		CBA
		   ABCBA	1	1	5
		    ABA		2	2	3					ABC	    BA
		     A		3	3	1              		 AB		A
												  A
		*/
        int num = 0;  //num为字母菱形行数  最大 (26 * 2 - 1) = 51 行
        System.out.println("请输入1~51中的一个数，将打印字母菱形");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        //打印上半部分
        for (int i = 1;i <= (num + 1) / 2;i++) {
            for (int j = 1;j <= ((num + 1) / 2) - i;j++) {
                System.out.print(" ");
            }
            for (char ch1 = 'A';ch1 <= (char)('A' + i - 1);ch1++) { //for (int j = 1;j <= i;j++) {
                System.out.print(ch1);							   //	System.out.print('A' + j);}
            }
            for (char ch2 = (char)('A' + i - 2);ch2 >= 'A';ch2--) {
                System.out.print(ch2);
            }
            System.out.println();
        }

        //打印下半部分
        for (int i = 1;i <= (num - 1) / 2;i++) {
            for (int j = 1;j <= i;j++) {
                System.out.print(" ");
            }
            for (char ch1 = 'A';ch1 <= (char)('A' + (num - 1) / 2 - i);ch1++) {
                System.out.print(ch1);
            }
            for (char ch2 = (char)('A' + (num - 1) / 2 - i - 1);ch2 >= 'A';ch2--) {
                System.out.print(ch2);
            }
            System.out.println();
        }

    }

}
