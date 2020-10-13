package edu.sctu.java.实验二.Test4;

public class Staff {
    String StaffName;
    int StaffNum;
    int Salary;
    int RaiseSalary;
    Staff(String StaffName,int StaffNum,int Salary,int Raise){
        this.Salary = Salary;
        this.StaffName = StaffName;
        this.StaffNum = StaffNum;
        this.RaiseSalary = Raise;
    }
    Staff(){

    }
    void getStaffName(){
        System.out.println(this.StaffName);
    }
    void getStaffNum(){
        System.out.println(this.StaffNum);
    }
    void getStaffSalary(){
        System.out.println(this.Salary);
    }
    void getRaiseSalary(){
        System.out.println(this.RaiseSalary);
    }
    void getTotal(){
        System.out.println(this.RaiseSalary + this.Salary);
    }

    public static void main(String[] args) {
        Staff std = new Staff("John",1,1000,200);
        std.getTotal();

    }
}
