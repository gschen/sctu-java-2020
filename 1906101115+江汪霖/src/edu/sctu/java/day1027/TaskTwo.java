package edu.sctu.java.day1027;

public class TaskTwo extends Thread {

    int n;

    TaskTwo(int n){
        this.n = n;
    }


    @Override
    public void run() {
        super.run();
        for (int i = 26; i <= this.n ; i++) {
            System.out.println("正在下载url"+i);
        }
    }
}

