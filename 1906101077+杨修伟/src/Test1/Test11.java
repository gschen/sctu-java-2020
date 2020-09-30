package Test1;

import java.util.Scanner;
public class Test11 {
    public static void main(String[] args) {
        System.out.println("输入g:");
        Scanner s = new Scanner(System.in);
        String g = s.next();
        int count = g.length();
        int j=0;
        while (j<=(count/2)-1 && g.charAt(j)== g.charAt(count-j-1))
            j++;
        if (j==count/2)
            System.out.println("是回文数");
        else
            System.out.println("不是回文数");


    }
}
