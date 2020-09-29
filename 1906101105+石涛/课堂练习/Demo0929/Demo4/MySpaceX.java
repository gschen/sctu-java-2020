package Demo0929.Demo4;

import java.util.Scanner;

public class MySpaceX implements SpaceX{
    // 输入类
    Scanner in = new Scanner(System.in);

    // 重写接口的方法
    @Override
    public void start() {
        System.out.println("飞机开始启动");
    }

    @Override
    public void shutdown() {
        System.out.println("飞机已经关闭");
    }

    @Override
    public void run() {
        System.out.println("飞机开始运行");

        while (true) {
            char cmd = in.next().charAt(0);
            switch (cmd) {
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
        }
    }

    @Override
    public void up() {
        System.out.println("飞机向上飞行");
    }

    @Override
    public void down() {
        System.out.println("飞机向下飞行");
    }

    @Override
    public void left() {
        System.out.println("飞机向左飞行");
    }

    @Override
    public void right() {
        System.out.println("飞机向右飞行");
    }
}
