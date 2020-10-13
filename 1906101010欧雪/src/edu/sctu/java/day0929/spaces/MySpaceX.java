package edu.sctu.java.day0929.spaces;

import java.util.Scanner;

public class MySpaceX implements SpaceX{
    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void shutdown() {
        System.out.println("shutdown");
    }

    @Override
    public void run() {
        System.out.println("run");









        while (true){


            try {
               //有错误的代码
            }catch (Exception e){
           }
//            用户输入命令
            Scanner scanner=new Scanner(System.in);
            char cmd=scanner.next().charAt(0);

            switch (cmd){
                case 'u':
                    up();
                    break;
                case '1':
                    left();
                    break;
                case 'd':
                    down();
                    break;
                case 'a':
                    attack();
                    break;
                case 'f':
                    shutdown();
                    break;
                case'q':
                    right();
                    break;
            }
        }
    }

    @Override
    public void up() {
        System.out.println("up");
    }

    @Override
    public void down() {
        System.out.println("down");
    }

    @Override
    public void left() {
        System.out.println("left");
    }

    @Override
    public void right() {
        System.out.println("right");
    }

    @Override
    public void attack() {
        System.out.println("attack");
    }
}
