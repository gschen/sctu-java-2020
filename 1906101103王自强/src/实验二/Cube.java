package 实验二;

import java.util.Scanner;

public class Cube {
    double length;
    double width;
    double high;

    void setLwH(double l,double w,double h){
        this.length=l;
        this.width= w;
        this.high= h;

    }
    void getV(){
        double V=length*width*high;
        System.out.println("体积是："+V);
    }

    public static void main(String[] args) {
        Cube cube=new Cube();
        Scanner input=new Scanner(System.in);
        System.out.println("请输入长宽高：");
        double l=input.nextDouble();
        double w=input.nextDouble();
        double h=input.nextDouble();

        cube.setLwH(l,w,h);
        cube.getV();
    }
}
