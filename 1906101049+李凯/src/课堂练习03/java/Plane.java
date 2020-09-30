package 课堂练习03.java;

import java.util.Scanner;

public class Plane {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入指令i=");
        int ii = input.nextInt();
        for (int i = 0; i <= 8; i++) {
            if (i == 1) {
                System.out.println("启动");
            } else if (i == 2) {
                System.out.println("关闭");
            }else if(i ==3){
                System.out.println("运行");
            }else if(i ==4){
                System.out.println("向上u");
            }else if(i ==5){
                System.out.println("向下d");
            }else if(i ==6){
                System.out.println("向左l");
            }else if(i ==7){
                System.out.println("向右r");
            }else {
                System.out.println("退出q");
            }
        }
    }
}
