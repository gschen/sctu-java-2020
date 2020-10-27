package edu.sctu.java.day1027;

public class TaskOne implements Runnable{
    int start;
    int end;
    void setN(int v){
        this.start = v;
    }
    TaskOne(){

    }
    TaskOne(int v,int e){
        this.start = v;
        this.end = e;
    }


    @Override
    public void run() {
        for (int i = start; i < end ; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(i);
        }
    }
}
