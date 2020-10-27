package edu.sctu.java.day1027;

public class TaskThree implements Runnable{

    int n;

    TaskThree( int n){
        this.n = n;
    }


    @Override
    public void run() {
        for (int i = 51; i <= this.n ; i++) {
            System.out.println("正在下载url"+i);
        }

    }
}
