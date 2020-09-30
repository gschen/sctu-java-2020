package 实验一;

import java.util.Scanner;

// 输入学生的学习成绩的等级，给出相应的成绩范围。设A级为85分以上（包括85）；B级为70分以上（包括70分）；
// C级为60分以上（包括60分）；D级为60分以下。
public class Test06 {
    public static void main(String[] args) {
        // 输入
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        // 判断
        if(a>=85){
            if(a>100){
                System.out.println("请输入正确的成绩");
            }
            System.out.println("A");
        }
        else if(a>=70){
            System.out.println("B");
        }
        else if(a>=60){
            System.out.println("C");
        }
        else if(a>=0){
            System.out.println("D");
        }
        else {
            System.out.println("请输入正确的成绩!");
        }
    }
}
