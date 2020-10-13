package 实验二.Test35;

public class Worker extends Employee{
    // 属性
    int days;
    double workPay;

    // 重写父类方法
    @Override
    double computeSalary() {
        return days*workPay;
    }
}
