package edu.sctu.java.day1027;

public class TaskOne implements Runnable{

    private int n;

    TaskOne(){

    }

    TaskOne(int n){
        this.n = n;
    }
    void setN(int v){
        this.n = v;
    }

    public static void main(String[] args) {
        // 构造函数和setN对属性n赋值的区别
        TaskOne one = new TaskOne();
        one.setN(10);

        new TaskOne(10);
    }

    @Override
    public void run() {
        System.out.println("我是线程1号.");

        for (int i = 0; i < this.n; i++) {
            System.out.print(i);
        }
    }
}
