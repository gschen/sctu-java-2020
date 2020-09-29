package edu.sctu.java.test;

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

        Scanner scanner = new Scanner(System.in);

        while(true){

            char cmd = scanner.next().charAt(0);

            if (cmd == 'u'){
                up();
            }else if (cmd == 'q'){
                shutdown();
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
}
