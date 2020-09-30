package 实验一;

import java.util.Random;
import java.util.Scanner;

// 猜数字
public class Test07 {
    public static void main(String[] args) {
        // 随机生成一个值
        Random random = new Random();
        int select = random.nextInt(101);
        System.out.println("正确答案："+select);
        // 输入
        Scanner in =new Scanner(System.in);
        int a =in.nextInt();

        while(a!=select){
            if(a>select){
                System.out.println("猜大了");
            }
            else {
                System.out.println("猜小了");
            }
            a = in.nextInt();
        }
        System.out.println("猜对了");
    }
}
