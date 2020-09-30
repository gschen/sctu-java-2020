package edu.sctu.java.day0929;

import java.util.Scanner;

public class Fly {

    void ff(){
        Scanner input = new Scanner(System.in);
        try {
            String act = input.next();
            if(act.equals("open")) {
                System.out.println("开始运行");
                while (true) {
                    act = input.next();
                    if (act.equals("u")) {
                        System.out.println("向上");
                    } else if (act.equals("d")) {
                        System.out.println("向下");
                    } else if (act.equals("l")) {
                        System.out.println("向左");
                    } else if(act.equals("r")){
                        System.out.println("向右");
                    } else if(act.equals("q")) {
                        System.out.println("是否退出？yes/No");
                        String confirm = input.next();
                        if (confirm.equals("yes")){
                            System.out.println("退出成功");
                            break;
                        }
                    } else if (act.equals("close")){
                        break;
                    }else{
                        System.out.println("操作错误");
                    }
                }
            }else{
                System.out.println("操作错误");
                ff();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Fly fly = new Fly();
        fly.ff();
    }


}
