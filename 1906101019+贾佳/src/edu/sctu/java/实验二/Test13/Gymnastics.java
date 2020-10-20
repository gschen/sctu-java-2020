package edu.sctu.java.实验二.Test13;

import java.util.ArrayList;
import java.util.List;

public class Gymnastics extends ComputerAverage{
    List<Double> arr= new ArrayList<Double>();
    double sum;
    double max,min;
    @Override
    public void average() {
        max = arr.get(0);
        min = arr.get(0);
        for (Double aDouble : arr) {
            if (aDouble > max)
                max = aDouble;
            if (aDouble < min)
                min = aDouble;
        }
        arr.remove(max);
        arr.remove(min);
        for(Double x : arr){
            sum+=x;
        }
        System.out.println(sum/arr.size());
    }

    public static void main(String[] args) {
        Gymnastics gym = new Gymnastics();
        gym.arr.add(10.0);
        gym.arr.add(20.0);
        gym.arr.add(30.0);
        gym.arr.add(40.0);
        gym.arr.add(50.0);
        gym.average();
    }
}
