package edu.sctu.java.day1007;

public class Triangle {

    double a;
    double b;
    double c;
    double perimeter=a+b+c;
    double area;
    boolean d=true;

    void getPerimeter(){
        System.out.println("周长为："+perimeter);
    }

    void getAreas() {
        System.out.println("面积为："+area);
    }

    void changeBorder(double a,double b,double c){
    }

    void judge(){
        if (a+b>c) {
            System.out.println(d);
        }
        else{
            System.out.println(d=false);
        }
    }
}

class Ladder{

    double a;
    double b;
    double c;
    double area=(a+c)*c/2;

    void getArea(){
        System.out.println("面积为："+area);
    }
}

class Circle{

    double r;
    double perimeter=2*r*3.14;
    double area=r*r*3.14;

    void getPerimeter(){
        System.out.println("周长为："+perimeter);
    }

    void getArea(){
        System.out.println("面积为："+area);
    }
}
