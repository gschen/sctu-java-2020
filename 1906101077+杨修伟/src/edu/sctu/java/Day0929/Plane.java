package edu.sctu.java.Day0929;

import java.util.Scanner;

public class Plane {
    public static void main(String[] args) {
        System.out.println("欢迎使用！！");
        System.out.println("是否启动,启动请按1");
        Scanner m = new Scanner(System.in);
        int n = m.nextInt();
        if (n==1) {
            System.out.println("飞机已启动");
            System.out.println("飞机正在运行");
            System.out.println("请输入飞行方向：");
            Scanner s = new Scanner(System.in);
            String i = s.next();
            if (i.equals("u"))
                System.out.println("向上");
            if (i.equals("d"))
                System.out.println("向下");
            if (i.equals("l"))
                System.out.println("向左");
            if (i.equals("r"))
                System.out.println("向右");

            System.out.println("操作已完成是否退出操作");
            Scanner e = new Scanner(System.in);
            String o = e.next();
            if (o.equals("q"))
                System.out.println("操作系统已退出,感谢你的使用");
        }
        if (n!=1)
            System.out.println("飞机处于关闭状态，请先启动");



    }

}
