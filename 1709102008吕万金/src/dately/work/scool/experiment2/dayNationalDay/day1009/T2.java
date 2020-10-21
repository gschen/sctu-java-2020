package dately.work.scool.experiment2.dayNationalDay.day1009;

import java.util.Scanner;

public class T2 {
    Scanner scanner=new Scanner(System.in);
    double r=scanner.nextDouble();
    double s;
    double c;
    void area(){
        s=r*r;
        System.out.println("面积为："+s+"Π"+"cm²");
    }
    void perimeter(){
        c=2*r;
        System.out.println("周长是："+c+"Π"+"cm");
    }

    public static void main(String[] args) {
        T2 test1=new T2();
        test1.area();
        test1.perimeter();

    }
}
