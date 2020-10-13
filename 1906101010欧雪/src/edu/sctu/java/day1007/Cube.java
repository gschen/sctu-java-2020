package edu.sctu.java.day1007;

public class Cube {
    int length;
    int width;
    int height;
    Cube(int length,int width,int height){
        this.length=length;
        this.width=width;
        this.height=height;
    }
    void countVolume(){
        System.out.println("立方体的体积："+(length*width*height));
    }

    public static void main(String[] args) {
        Cube cube=new Cube(1,2,3);
        cube.countVolume();
    }
}
