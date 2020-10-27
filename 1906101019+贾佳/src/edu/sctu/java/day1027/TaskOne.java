package edu.sctu.java.day1027;

public class TaskOne implements Runnable{
    int n;

    void setN(int v){
        this.n = v;
    }
    TaskOne(){

    }
    TaskOne(int v){
        this.n = v;
    }


    @Override
    public void run() {
        System.out.println("我是线程1号。");
        for (int i = 0; i < this.n ; i++) {
            System.out.print(i);
        }
    }
}
