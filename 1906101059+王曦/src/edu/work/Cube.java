package edu.work;

public class Cube {

    int length;
    int wide;
    int high;

    Cube(int length,int wide,int high){

        this.length = length;
        this.wide = wide;
        this.high = high;


    }


    void getarea(){

        System.out.println(length*wide*high);
    }
}
