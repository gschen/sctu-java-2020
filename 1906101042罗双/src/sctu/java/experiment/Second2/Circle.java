package sctu.java.experiment.Second2;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        double p = 3.1415926;
        double r;
        System.out.println("请输入半径：");
        Scanner s = new Scanner(System.in);
        r = Double.parseDouble(s.next());
        System.out.println("圆的面积为"+p*r*r);
        System.out.println("圆的周长为"+p*2*r);
    }
}
