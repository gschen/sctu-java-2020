package edu.sctu.java.day0929.SpaceX;

import java.util.Scanner;

public class MySpaceX implements SpaceX {
    @Override
    public void start() {
        System.out.println("开始");
    }

    @Override
    public void shutdown() {
        System.out.println("结束");
    }

    @Override
    public void run() {
        System.out.println("运行");
        while (true){
            Scanner scanner= new Scanner(System.in);
            //用户输入命令
            char cmd= scanner.next().charAt(0);

            switch (cmd){
                case 'u':
                    up();
                case 'l':
                    left();
                case 'r':
                    right();
                case 'd':
                    down();
                case 'q':
                    shutdown();
                    break;
            }

        }
    }

    @Override
    public void up() {
        System.out.println("向上");
    }

    @Override
    public void down() {
        System.out.println("向下");
    }

    @Override
    public void left() {
        System.out.println("向左");
    }

    @Override
    public void right() {
        System.out.println("向右");
    }

    @Override
    public void attack() {
        System.out.println("供给");
    }

}
