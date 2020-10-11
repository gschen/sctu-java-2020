package 实验二;

public class Test29 {
    public static void main(String[] args) {
        int[] nums = {4,5,6};

        // 异常处理
        try {
            for (int i = 0; i < nums.length+1; i++) {
                System.out.println(nums[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界！");
        }finally {
            System.out.println("错误！");
        }
    }
}
