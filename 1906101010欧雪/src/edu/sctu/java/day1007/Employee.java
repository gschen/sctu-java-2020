package edu.sctu.java.day1007;

public class Employee {
    String name;
    int no;
    double salary;
    double amount;
    Employee(String name, int no, double salary, double amount, double v){
        this.name=name;
        this.no=no;
        this.salary=salary;
        this.amount=amount;
    }
    void getName(){
        System.out.println("该员工姓名："+name);
    }
    void getNo(){
        System.out.println("该员工号码："+no);
    }
    void getSalary(){
        System.out.println("该员工基本薪水："+salary);
    }
    void countAmount(){
        System.out.println("该员工薪水增长额："+amount);
    }
    void countSalary(){
        System.out.println("该员工增长后的工资总额："+(salary*(1+amount)));
    }

    public static void main(String[] args) {
        Employee employee=new Employee("欧慕婕",1906101520,7000,0,0.34);
        System.out.println("员工信息如下：");
        employee.getName();
        employee.getNo();
        employee.getSalary();
        employee.countAmount();
        employee.countSalary();
    }
}
