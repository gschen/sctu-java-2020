package edu.sctu.java.实验1;
public class Test02 {
    public static void main(String[] args) {
        for (int i=100;i<=300;i++){
            if (i%3==0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
