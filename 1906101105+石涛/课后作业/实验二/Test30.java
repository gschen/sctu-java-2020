package 实验二;

import java.util.Scanner;

// 从键盘读取一个考试分数列表，计算它们的平均分。
public class Test30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("输入一组数据，用空格隔开：");
        String input = in.nextLine().toString(); // 转换为字符串
        String[] list = input.split(" "); // spit分割字符串

        double sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum+=Integer.parseInt(list[i]);
        }
        System.out.println("平均分为："+(sum/list.length));
    }
}
