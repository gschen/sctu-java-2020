package edu.sctu.java.day0929;

import java.util.Scanner;

public class Plane {
    void start() {
        System.out.println("飞机已启动");
    }

    void run() {
        System.out.println("飞机系统开始运行！");
    }

    void up() {
        System.out.println("飞机正在向上！");
    }

    void down() {
        System.out.println("飞机正在向下！");
    }

    void left() {
        System.out.println("飞机正在向左！");
    }

    void right() {
        System.out.println("飞机正在向右！");
    }

    void esc() {
        System.out.println("退出操作程序！");
    }

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
                while (true) {
                    System.out.println("请输入飞机操作命令：");
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
