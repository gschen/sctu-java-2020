package Lab.lab01;

import java.util.Scanner;

public class Demo11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入1-9999的整数：");
        int input = scan.nextInt();

        if (input >= 1) {
            if (input <= 10) {
                System.out.println("该数是一位数");
            }else if (input <= 99) {
                System.out.println("该数是两位数");
            }else if (input <= 999) {
                System.out.println("该数是三位数");
            }else if (input <= 9999) {
                System.out.println("该数是四位数");
            }
        }

        //数字转换成字符串
        String s = String.valueOf(input);
//        String s = input + "";
//        String s = Integer.toString(input);

        StringBuilder s1 = new StringBuilder(s);
        s1.reverse();

        int i,sum = 0;

        for(i = 0;i < s.length();i++) {
            if(s.charAt(i) == s1.charAt(i))
                sum++;
        }
        if(sum == s.length()) {
            System.out.println("是回文数");
        }else {
            System.out.println("不是回文数");
        }
    }
}
