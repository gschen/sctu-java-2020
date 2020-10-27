package edu.sctu.java.day1027;

public class TaskOne implements Runnable {

    int n;

    TaskOne(){

    }

    TaskOne( int n){
        this.n = n;
    }

    @Override
    public void run() {

        for (int i = 1; i <= this.n ; i++) {
            System.out.println("正在下载url"+i);
        }
    }
}
