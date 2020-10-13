package edu.sctu.java.实验二.Test22;

import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Change = input.next();
        System.out.println(Improve(Change));
    }
    public static char[] Improve(String str){
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(Character.isLowerCase(arr[i])){
                arr[i] = Character.toUpperCase(arr[i]);
            }else if (Character.isUpperCase(arr[i])){
                arr[i] = Character.toLowerCase(arr[i]);
            }else if (Character.isDigit(arr[i])){
                arr[i] = '0';
            }else {
                arr[i] = '#';
            }
        }
        return arr;
    }

}
