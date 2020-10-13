package 实验二.ComputerAverage;

public class School extends ComputerAverage{
    @Override
    public void average(double[] nums) {
        double sum=0;
        for (double num : nums) {
            sum = sum + num;
        }
        System.out.println(sum/nums.length);
    }
}
