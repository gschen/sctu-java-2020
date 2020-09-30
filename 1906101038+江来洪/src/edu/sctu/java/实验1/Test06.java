package edu.sctu.java.实验1;
import java.util.Scanner;
public class Test06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String grade = sc.next();
        if (grade.equals("A")){
            System.out.println("[85,100]");
        }else if(grade.equals("B")){
            System.out.println("[70,85)");
        }else if(grade.equals("C")){
            System.out.println("[60,70)");
        }else {
            System.out.println("[0,60)");
        }
    }
}
