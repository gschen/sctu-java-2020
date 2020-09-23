package edu.sctu.java.day0908;

public class SalarySystem {
    String name;
    double salary;
    int id;

    void getSalary(){
        System.out.println("获得工资");
    }

    public static void main(String[] args) {

        // s1 变量, 对象
        SalarySystem s1 = new SalarySystem();
        s1.name = "四川旅游学院工资系统";
        s1.id = 1001;
        s1.salary = 5000.0;

        s1.getSalary();
    }
}
