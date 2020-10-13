package edu.sctu.java.实验二.Test18;

public class St {
    public static void main(String[] args) {
        String name = "My name is Network crazy";
        char [] arr= name.toCharArray();
        String arr1 [] = name.split(" ", 2);
        System.out.println(arr.length);
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);
        System.out.println(arr1[0]);
        System.out.println(name.indexOf("crazy"));


    }
}
