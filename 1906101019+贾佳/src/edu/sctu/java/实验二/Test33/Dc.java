package edu.sctu.java.实验二.Test33;

import java.util.*;

public class Dc {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean flag=true;
        String temp = null;
        List<String> lis = new ArrayList<String>();
        do {
            System.out.println("请输入单词（输入0结束）：");
            temp=input.next();
            if (temp.equals("0")){
                break;
            }else {
                lis.add(temp);

            }
        }while(flag);

        Collections.sort(lis);
        System.out.println(lis);
    }
}
