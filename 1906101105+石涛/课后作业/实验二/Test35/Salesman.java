package 实验二.Test35;

public class Salesman extends Employee{
    // 属性
    double pay;
    int saleNum;
    double salePay;

    // 重写父类方法
    @Override
    double computeSalary() {
        return pay+saleNum*salePay;
    }
}
