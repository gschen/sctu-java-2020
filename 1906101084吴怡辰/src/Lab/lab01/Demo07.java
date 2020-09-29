package Lab.lab01;

import java.util.Scanner;

public class Demo07 {
    public static void main(String[] args) {

        int num = (int)((Math.random()*100)+1);

        Scanner input = new Scanner(System.in);
        System.out.println("请输入数字：");

        int n = input.nextInt();

        do {
            if (n < num) {
                System.out.println("猜小了");
                System.out.println("请输入数字：");
                n = input.nextInt();
            }else if (n > num) {
                System.out.println("猜大了");
                System.out.println("请输入数字：");
                n = input.nextInt();
            }
        } while (n != num);
        System.out.println("猜对了");
    }
}
