package edu.work.text11;

public class Rectangle implements Printx{

    double longs;
    double weigh;



    void getperimter(){
        System.out.print((longs+weigh)*2);
    }

    void getarea(){
        System.out.print(longs*weigh);
    }

    @Override
    public void printMyWay() {
        System.out.println("longs"+longs);
        System.out.println("weigh"+weigh);
        System.out.println("getperimter");
        this.getperimter();
        System.out.println("getarea");
        this.getarea();
    }
}
