package edu.sctu.java.实验二.Test35;

public class JavaApplication {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Salesman salesman = new Salesman(4000);
        Worker worker = new Worker(10);
        manager.computeSalary();
        salesman.computeSalary();
        worker.computeSalary();

    }
}
