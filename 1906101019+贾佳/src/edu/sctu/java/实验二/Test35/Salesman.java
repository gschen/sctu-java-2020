package edu.sctu.java.实验二.Test35;

public class Salesman extends Employee{
    double Promote;
    Salesman(double Promote){
        this.Promote = Promote;
    }
    @Override
    void computeSalary() {
        double BaseSalary = 3000;
        System.out.println(3000+this.Promote);
    }
}
