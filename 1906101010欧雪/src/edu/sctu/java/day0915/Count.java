package edu.sctu.java.day0915;

public class Count {
    public static void main(String[] args) {
        for(int i=100;i<=300;i++){
            if(i%3==0)continue;
            System.out.print(i+" ");
        }
    }
}
