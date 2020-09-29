package edu.sctu.java.day0929;

import java.util.Scanner;
public class CtrlPlane {


    public static void main(String[] args) {
        Scanner ctrl = new Scanner(System.in);
        System.out.println("是否启动飞机（\"是(1)\"or\"否(0)\"）");
        String play1 = ctrl.next();
        if (play1.equals("1")) {
            System.out.println("飞机正在运行中");
            System.out.println("请进行操作：u、d、l、r、q");
            label:
            while (true) {
                String play2 = ctrl.next();
                switch (play2) {
                    case "u":
                        System.out.println("飞机向上移动");
                        break;
                    case "d":
                        System.out.println("飞机向下移动");
                        break;
                    case "l":
                        System.out.println("飞机向左移动");
                        break;
                    case "r":
                        System.out.println("飞机向右移动");
                        break;
                    case "q":
                        System.out.println("你启动了退出程序按钮，飞机退出操作");
                        break label;
                    default:
                        System.out.println("操作指令错误，运行失败");
                        break label;
                }
            }
        } else {
            System.out.println("你取消了操作。");

        }
    }
}

//    public void start(){
//        System.out.println("启动");
//    }
//    public void close(){
//        System.out.println("关闭");
//    }
//    public void play(){
//        System.out.println("运行");
//    }
//    public void up(){
//        System.out.println("向上");
//    }
//    public void down(){
//        System.out.println("向下");
//    }
//    public void left(){
//        System.out.println("向左");
//    }
//    public void right(){
//        System.out.println("向右");
//    }
//    public void quit(){
//        System.out.println("退出");
//    }