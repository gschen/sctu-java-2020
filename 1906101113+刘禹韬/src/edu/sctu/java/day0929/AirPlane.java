package edu.sctu.java.day0929;

import java.util.Scanner;

public class AirPlane implements AirPlaneAction {

    String state;

    @Override
    public void start(){
        state = "turn";
        System.out.println("飞机引擎启动");

    }

    @Override
    public void shutdown(){
        state = "off";
        System.out.println("飞机引擎关闭");

    }

    @Override
    public void run(){
        Scanner s = new Scanner(System.in);
        if (state.equals("turn")) {
            System.out.println("飞机正在运行");
            while (true) {
                char in = s.next().charAt(0);
                try {
                    switch (in){
                        case 'u':
                            up();
                            break;
                        case 'd':
                            down();
                            break;
                        case 'l':
                            left();
                            break;
                        case 'r':
                            right();
                            break;
                        case 'q':
                            shutdown();
                            System.exit(0);
                            break;
                    }

                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        }else {
            System.out.println("没有开启引擎,飞机启动失败");
        }


    }

    @Override
    public void up() {
        System.out.println("飞机向上移动一个单位");
    }

    @Override
    public void down() {
        System.out.println("飞机向下移动一个单位");
    }

    @Override
    public void left() {
        System.out.println("飞机向左移动一个单位");
    }

    @Override
    public void right() {
        System.out.println("飞机向右移动一个单位");
    }


}
