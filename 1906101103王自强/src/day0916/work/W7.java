package day0916.work;
import java.util.Scanner;
public class W7 {
    void guess(int n,int i){
        if(n<i){
            System.out.println("猜小了");
        }
        else if(n>i){
            System.out.println("猜大了");
        }
        else {
            System.out.println("猜对了");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        W7 w7=new W7();
        double d = Math.random();
        int i = (int)(d * 100);
        int n=sc.nextInt();
        while (true){
            w7.guess(n,i);
            if(n==i){
                break;
            }
            n=sc.nextInt();
        }
    }
}