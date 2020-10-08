package 实验二;

import java.util.Scanner;

public class Test27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 异常处理
        try {
            int a = in.nextInt();
        }catch (Exception e){
            System.out.println("输入错误！");
        }
    }
}
