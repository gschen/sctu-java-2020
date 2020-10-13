package edu.sctu.java.实验二.Test13;

public class School extends ComputerAverage{
    double [] arr = {10.0,20.0,30.0,40.0,50.0,60.0};
    double sum;
    @Override
    public void average() {
        for (double v : arr) {
            sum += v;

        }
        System.out.println(sum/arr.length);
    }

    public static void main(String[] args) {
        School sc = new School();
        sc.average();
    }
}
