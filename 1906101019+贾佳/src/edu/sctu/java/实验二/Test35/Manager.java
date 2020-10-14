package edu.sctu.java.实验二.Test35;

public class Manager extends Employee{
    @Override
    void computeSalary() {
        double Salary = 3000;
        System.out.println("每月固定工资"+Salary+"元");
    }
}
