package day0923.Work.ComputerAverage;

public class Gymnastics extends ComputerAverage {
    @Override
    public void average(double[] nums) {
        double maxGrade = nums[0];
        for (double num : nums) {
            if (maxGrade < num) {
                maxGrade = num;
            }
        }
        double minGrade = nums[0];
        for (double num : nums) {
            if (minGrade > num) {
                minGrade = num;
            }
        }
        double sum = 0;
        for (double num : nums) {
            sum = sum + num;
        }
        System.out.println((sum - maxGrade - minGrade) / (nums.length - 2));
    }
}
