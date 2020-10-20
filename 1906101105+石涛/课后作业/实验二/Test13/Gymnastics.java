package 实验二.Test13;

import java.util.*;

public class Gymnastics extends ComputerAverage{
    // 重写父类方法
    @Override
    void average() {
        double[] grades = {9,8,4,5,6,7,9};

        Arrays.sort(grades); // 对数组进行排序
        double sum=0;
        for (int i=1;i<grades.length-1;i++) { // 去掉首位数
            sum+=grades[i];
        }
        double averages = sum /(grades.length-2);

        System.out.println("平均分为："+averages);
    }
}
