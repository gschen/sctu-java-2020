package Demo0929.Demo3;

import java.util.Scanner;

public class Client {
    void run(){
        Scanner in = new Scanner(System.in);
        label:
        while (true){
            System.out.println("请输入你的操作：");
            String inputs = in.next(); // 输入值
            switch (inputs) {
                case "u":
                    System.out.println("飞机向上飞行...");
                    break;
                case "d":
                    System.out.println("飞机向下飞行...");
                    break;
                case "l":
                    System.out.println("飞机向左飞行...");
                    break;
                case "r":
                    System.out.println("飞机向右飞行...");
                    break;
                case "q":
                    System.out.println("退出飞行操作!");
                    System.out.println("是否再次进入操作？（输入”是“或”否“）");
                    String ifBreak = in.next();
                    if (ifBreak.equals("是")) {
                        run();
                    }
                    else {
                        System.out.println("退出操作,关闭飞机！");
                    }
                    break label;
                default:
                    System.out.println("操作错误，退出操作！");
                    break label;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Client client = new Client();

        System.out.println("是否启动飞机？（输入”启动“或者”关闭“）");
        String running = in.next(); // 启动
        if (running.equals("启动")){
            System.out.println("飞机开始运行起飞...");
            client.run();
        }
        else if(running.equals("关闭")){
            System.out.println("飞机已经关闭");
        }
        else {
            System.out.println("操作失误，飞机未启动");
        }
    }
}