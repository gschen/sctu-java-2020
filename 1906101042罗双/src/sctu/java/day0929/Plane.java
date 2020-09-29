package sctu.java.day0929;


import java.util.Scanner;

public class Plane implements PlaneAction {


    @Override
    public void start() {
        System.out.println("飞机起飞");
    }

    @Override
    public void stop() {
        System.out.println("飞机停止");
    }

    @Override
    public void operate() {
        System.out.println("飞机运行");

        while(true){
            try {
                Scanner scanner = new Scanner(System.in);
                //用户输入命令
                char cmd = scanner.next().charAt(0);

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
                        stop();
                        System.exit(0);

                }

            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    @Override
    public void up() {
        System.out.println("向上飞");
        System.out.println(10/0);
    }

    @Override
    public void down() {
        System.out.println("向下飞");
    }

    @Override
    public void left() {
        System.out.println("向左飞");
    }

    @Override
    public void right() {
        System.out.println("向右飞");
    }
}

