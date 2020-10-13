package edu.work.form;

import javax.swing.plaf.BorderUIResource;

public class Triangle {

    double sideA ;
    double sideB ;
    double sideC ;

    double perimeter;
    double area;
    boolean triangle ;

    Triangle(double sideA,double sideB,double sideC,double perimeter,double area){

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.perimeter = perimeter;
        this.area = area;


    }



    void getperimter(){
        System.out.println(perimeter);
    }

    void grtarea(){
        System.out.println(area);
    }


    void resetsideA(double i){
        sideA = i;
    }


    void resetsideB(double i){
        sideB = i;
    }


    void resetsideC(double i){
        sideC = i;
    }




}
