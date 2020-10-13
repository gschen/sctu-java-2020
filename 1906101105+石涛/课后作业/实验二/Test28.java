package 实验二;

import java.util.Scanner;

public class Test28 {
    // 圆的面积
    void area(){
        Scanner in = new Scanner(System.in);
        double radius = in.nextInt();
        System.out.println(Math.PI * radius * radius);
    }

    public static void main(String[] args) {
        Test28 t = new Test28();

        // 异常处理
        try {
            t.area();
        } catch (Exception e) {
            System.out.println("输入错误！请再次输入:");
            t.area();
        }
    }
}
