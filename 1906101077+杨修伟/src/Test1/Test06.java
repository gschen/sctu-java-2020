package Test1;

import java.util.Scanner;
public class Test06 {
    public static void main(String[] args) {
        System.out.println("输入学生成绩g:");
        Scanner s = new Scanner(System.in);
        int g = s.nextInt();
        if (g < 60)
            System.out.println("D");
        if (60 <= g && g < 70)
            System.out.println("C");
        if (70 <= g && g < 85)
            System.out.println("B");
        if (g >= 85)
            System.out.println("A");

    }
}

