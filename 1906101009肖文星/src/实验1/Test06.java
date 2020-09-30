package 实验1;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int test=input.nextInt();
        if(test>=85){
            System.out.println("A");
        }else if(test>=70 && test<=84){
            System.out.println("B");
        }else if (test>=60&&test<=69){
            System.out.println("C");
        }else {
            System.out.println("D");
        }
    }
}
