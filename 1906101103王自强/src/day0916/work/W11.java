package day0916.work;

import java.util.Scanner;
public class W11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个1-9999的数：");
            String  i=sc.next();
        System.out.println("这是一个"+i.length()+"位数");
        StringBuffer buffer=new StringBuffer(i);
        String j=buffer.reverse().toString();
        if(j.equals(i)){
            System.out.println("这是一个回文数");
        }
        else{
            System.out.println("这不是一个回文数");
        }
    }
}

