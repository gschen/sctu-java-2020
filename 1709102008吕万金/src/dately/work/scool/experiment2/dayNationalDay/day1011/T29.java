package dately.work.scool.experiment2.dayNationalDay.day1011;

public class T29 {
    public static void main(String[] args) {
        int[] nums = {12,13,14,15,16};
        try {
            for (int i = 0; i < nums.length + 1; i++) {
                System.out.println(nums[i]);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界");
        }finally {
            System.out.println("错误");
        }
    }
}
