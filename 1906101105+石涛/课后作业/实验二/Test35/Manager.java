package 实验二.Test35;

public class Manager extends Employee{
    // 属性
    double pay;

    // 重写父类方法
    @Override
    double computeSalary() {
        return pay;
    }
}
