package edu.sctu.java.实验二.Test6;

public class Triangle {
    double side1;
    double side2;
    double side3;
    Triangle(double s1, double s2, double s3){
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }
    Triangle(){

    }
    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    void getlength(){
        System.out.println(this.side1+this.side2+this.side3);
    }
    void getSquare(){
        double s =(this.side1+this.side2+this.side3)/2d;
        double S = Math.sqrt(s*(s-this.side1)*(s-this.side2)*(s-this.side3));
        if (this.side1+this.side2>this.side3 && this.side2+this.side3>this.side1 && this.side1+this.side3>this.side3){
            System.out.println(S);
        }
        else{
            System.out.println("不成立三角形");
        }

    }
    boolean If(){
        if (this.side1+this.side2>this.side3 && this.side2+this.side3>this.side1 && this.side1+this.side3>this.side3){
            return true;
        }
        else{
            return false;
        }
    }

}
