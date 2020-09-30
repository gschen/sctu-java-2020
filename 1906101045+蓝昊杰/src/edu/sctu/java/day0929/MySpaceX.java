package edu.sctu.java.day0929;

import java.util.Scanner;

public class MySpaceX implements SpaceX{
    @Override
    public void start() {
        System.out.println("飞机启动中。。。");
        System.out.println("启动成功");
    }

    @Override
    public void shutdown() {
        System.out.println("飞机已关闭");

    }

    @Override
    public void run() {
        System.out.println("飞机运行中");
        while (true){
            //异常处理
            try{
                //出错的代码
                Scanner input = new Scanner(System.in);
                char cmd = input.next().charAt(0);

                switch (cmd){
                    case 'u':
                        up();
                        break;
                    case 'l':
                        left();
                        break;
                    case 'r':
                        right();
                        break;
                    case 'd':
                        down();
                        break;
                    case 'q':
                        shutdown();
                        System.exit(0);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }

    @Override
    public void up() {
        System.out.println("飞机向上");
        System.out.println(10/0);

    }

    @Override
    public void down() {
        System.out.println("飞机向下");

    }

    @Override
    public void left() {
        System.out.println("飞机向左");

    }

    @Override
    public void right() {
        System.out.println("飞机向右");

    }


}
