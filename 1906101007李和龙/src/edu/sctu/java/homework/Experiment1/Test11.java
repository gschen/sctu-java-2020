package edu.sctu.java.homework.Experiment1;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您想输入的字符串：");
        String str = scanner.next();
        char[] hws = str.toCharArray();

        StringBuilder s = new StringBuilder();
        for (int i = hws.length-1; i >= 0; i--) {
            s.append(hws[i]);

        }
        System.out.println(s.length());
        if(str.equals(s.toString())){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }
}
