package edu.sctu.java.day0929;

import java.util.Scanner;


public class Plane {
    void start(){
        System.out.println("已启动");
    }
    void shutdown(){
        System.out.println("已关闭");
    }
    void run(){
        System.out.println("正在运行");
    }
    void up(){
        System.out.println("向上");
    }
    void down(){
        System.out.println("向下");
    }
    void left(){
        System.out.println("向左");
    }
    void right(){
        System.out.println("向右");
    }
    void quit(){
        System.out.println("退出");
    }

    public static void main(String[] args) {

        Plane plane = new Plane();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String command = scanner.next();

            if (command.equals("start") ){
                plane.start();
                break;
            }else {
                System.out.println("飞机未启动");
            }

            if (command.equals("up")){
                plane.up();
            }else if (command.equals("down")){
                plane.down();
            }else if (command.equals("left")){
                plane.left();
            }else if (command.equals("right")){
                plane.right();
            }
        }


    }

}
