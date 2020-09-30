package day0929下;

import java.util.Scanner;

public class MySpaceX implements SpaceX {
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
                Scanner scanner=new Scanner(System.in);

                char cmd=scanner.next().charAt(0);

                switch (cmd){
                    case 'u':
                        up();
                        break;
                    case 'l':
                        left();
                        break;
                    case 'd':
                        down();
                        break;
                    case 'r':
                        right();
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
        System.out.println("up");
        System.out.println(10/0);

    }

    @Override
    public void down() {
        System.out.println("down");

    }

    @Override
    public void right() {
        System.out.println("right");

    }

    @Override
    public void left() {
        System.out.println("left");

    }

    @Override
    public void attack() {
        System.out.println("attack");

    }
}
