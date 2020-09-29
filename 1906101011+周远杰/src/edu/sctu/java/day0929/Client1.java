package edu.sctu.java.day0929;

import java.util.Scanner;

public class Client1 extends Plane{
    public static void main(String[] args) {
        Plane plane = new Plane();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入飞机启动命令：");
        String str = sc.next();
        if (str.equals("s")) {
            plane.start();
            System.out.println("请输入飞机运行命令：");
            String str1 = sc.next();
            if (str1.equals("n")) {
                plane.run();
                System.out.println("请输入飞机操作命令：");
                while (true) {
                    String str2 = sc.next();
                    if (str2.equals("u")) {
                        plane.up();
                    } else if (str2.equals("d")) {
                        plane.down();
                    } else if (str2.equals("l")) {
                        plane.left();
                    } else if (str2.equals("r")) {
                        plane.right();
                    } else if (str2.equals("q")) {
                        plane.esc();
                        break;
                    }else {
                        System.out.println("输入错误！");
                    }
                }
            } else {
                System.out.println("命令错误，飞机未运行！");
            }
        } else {
            System.out.println("命令错误，飞机未启动！");
        }
    }
}
