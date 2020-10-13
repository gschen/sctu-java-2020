package edu.sctu.java.实验二.Test5;

public class Square {
    double Length;
    double Width;
    double Height;
    Square(double L,double W,double H){
        this.Length = L;
        this.Width = W;
        this.Height = H;

    }
    Square(){

    }
    void getSquare(){
        System.out.println(this.Height*this.Width*this.Length);
    }

    public static void main(String[] args) {
        Square sqr = new Square(10,2,3);
        sqr.getSquare();
    }
}
