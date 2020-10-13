package edu.sctu.java.实验二.Test6;

public class Ladder {
    double UpEdge;
    double DownEdge;
    double Heght;
    Ladder(double U,double D,double H){
        this.UpEdge = U;
        this.DownEdge = D;
        this.Heght = H;
    }
    Ladder(){

    }
    void GetSquare(){
        System.out.println(((this.UpEdge+this.DownEdge)*this.Heght)/2);
    }
}
