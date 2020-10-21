package dately.work.scool.experiment2.dayNationalDay.day1011;

abstract class Employee35 {
    //计算工资的方法
    abstract double computeSalary();
}

class Manager35 extends Employee35 {

    double pay;

    @Override
    double computeSalary() {
        return pay;
    }
}

class SalesMan35 extends Employee35 {
    double pay;
    int salenum;
    double salepay;
    @Override
    double computeSalary() {
        return pay + salenum * salepay;
    }
}

class Worker35 extends Employee35 {

    double workpay;
    int days;
    @Override
    double computeSalary() {
        return workpay * days;
    }
}

