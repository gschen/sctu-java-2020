package edu.sctu.java.day1027;

public class TaskFour implements Runnable {

    int n;

    TaskFour(int n){
        this.n = n;
    }


    @Override
    public void run() {

        for (int i = 76; i <= this.n ; i++) {
            System.out.println("正在下载url"+i);
        }
    }
}
