package edu.sctu.java.day0929;

import java.util.Scanner;

public class Aircraft {

    void Start (){
        System.out.println("正在启动");
    }
    void ShutDown(){
        System.out.println("正在关闭");
    }
    void Running(){
        System.out.println("正在运行");


    }
    void Up(String order){
        if (order.equals("u")){
            System.out.println("向上飞");
        }else {
            System.out.println("输入有误");
        }

    }
    void Down(String order){
        if (order.equals("d")){
            System.out.println("向下飞");
        }else {
            System.out.println("输入有误");
        }
    }
    void Left(String order){
        if (order.equals("l")){
            System.out.println("向左飞");
        }else {
            System.out.println("输入有误");
        }
    }
    void Right(String order){
        if (order.equals("r")){
            System.out.println("向右飞");
        }else {
            System.out.println("输入有误");
        }
    }
    void Quit(String order){
        if (order.equals("q")){
            System.out.println("正在退出");
        }else {
            System.out.println("输入有误");
        }
    }
}
