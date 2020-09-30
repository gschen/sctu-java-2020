package edu.sctu.java.day0929;

import java.util.Scanner;
public class Demo01 {
    public static void main(String[] args) {
        start();
        run();
        while (true){
            try{
            System.out.println("输入指令:");
            Scanner s = new Scanner(System.in);
            String a = s.next();
            if (a.equals("")){
                close();
            }
            else if (a.equals("u")){
                up();
            }
            else if (a.equals("d")){
                down();
            }
            else if (a.equals("l")){
                left();
            }
            else if (a.equals("r")){
                right();
            }
            else if (a.equals("q")){
                out();
            }
            else {
                System.out.println("指令错误");
            }
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
    static void start(){
        System.out.println("启动");
    }
    static void close(){
        System.out.println("关闭");
    }
    static void run(){
        System.out.println("运行");
    }
    static void up(){
        System.out.println("向上");
    }
    static void down(){
        System.out.println("向下");
    }
    static void left(){
        System.out.println("向左");
    }
    static void right(){
        System.out.println("向右");
    }
    static void out(){
        System.out.println("退出");
    }
}
//            try{                                    异常处理
//
//                    }catch (Exception e){
//                    e.printStackTrace();
//                    }
