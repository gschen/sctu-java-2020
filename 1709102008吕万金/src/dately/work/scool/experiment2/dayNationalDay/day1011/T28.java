package dately.work.scool.experiment2.dayNationalDay.day1011;

import java.util.Scanner;

public class T28 {

    void area(){
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextInt();
        System.out.println(3.14 * radius * radius);
    }

    public static void main(String[] args) {
        T28 a = new T28();
        try{
            a.area();
        }catch(Exception e){
            System.out.println("输入错误，再次输入");
            a.area();
        }
    }
}
