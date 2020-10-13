package 实验二.Test13;

public class School extends ComputerAverage{
    // 重写父类方法
    @Override
    void average() {
        double[] grades = {97,85,76,92,78,74,86,78};

        double sum = 0;
        for (double i : grades){
            sum+=i;
        }

        System.out.println("平均分为："+(sum/grades.length));
    }
}
