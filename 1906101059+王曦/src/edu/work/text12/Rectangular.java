package edu.work.text12;

public class Rectangular extends Shape{

    double longs;
    double weigh;



    void getperimter(){
        System.out.print((longs+weigh)*2);
    }

    void getarea(){
        System.out.print(longs*weigh);
    }
}
