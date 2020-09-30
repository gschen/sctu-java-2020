package day0916.work;
import java.util.Scanner;
public class W6 {
    void level(float n){
        if(n<60){
            System.out.println("D");
        }
        else if(n<70&&n>=60){
            System.out.println("C");
        }
        else if(n<85&&n>=70){
            System.out.println("B");
        }
        else {
            System.out.println("A");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        W6 w6=new W6();
        System.out.println("请输入你的分数:");
        float grade=sc.nextFloat();
        System.out.println("你的等级是:");
        w6.level(grade);
    }
}
