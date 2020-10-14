package edu.sctu.java.实验二.Test35;

public class Worker extends Employee{
    int day;
    Worker(int day){
        this.day=day;
    }
    @Override
    void computeSalary() {
        int Salary = this.day*200;
        System.out.println(Salary);
    }
}
