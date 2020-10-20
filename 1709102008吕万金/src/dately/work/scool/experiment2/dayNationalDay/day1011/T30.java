package dately.work.scool.experiment2.dayNationalDay.day1011;

import java.util.Scanner;

public class T30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一组数据:");
        String input = sc.nextLine();
        String[] list = input.split(" ");

        double sum = 0;
        for (String s : list) {
            sum += Integer.parseInt(s);
        }

        System.out.println("平均分为:"+(sum / list.length));
    }
}
