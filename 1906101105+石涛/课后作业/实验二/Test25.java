package 实验二;

import java.util.Scanner;

// 数字转换的异常处理。输入两个数，计算两个数想除的结果（考虑除数为0的异常情况）。
public class Test25 {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);

        // 输入数字
        int a = in1.nextInt();
        int b = in2.nextInt();

        // 计算除法
        try {
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println("除数不能为0!");
        }
    }
}
