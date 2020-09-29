package edu.sctu.java.day0929;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Aircraft Air = new Aircraft();
        Scanner input = new Scanner(System.in);
        String s = input.next();
        if (s.equals("s")) {
            Air.Start();
            String Run = input.next();
            if (Run.equals("R")) {
                Air.Running();
                while (true) {
                    System.out.println("输入下一步指令");
                    String quit = input.next();
                    if(quit.equals("u")){
                        Air.Up(quit);}
                    if(quit.equals("d")){
                        Air.Down(quit);}
                    if(quit.equals("l")){
                        Air.Left(quit);}
                    if(quit.equals("r")){
                        Air.Right(quit);}
                    if (quit.equals("q")) {
                        Air.Quit(quit);
                        break;
                    }


                }
            }
        }else {
            System.out.println("输入有误");
        }
    }
}
