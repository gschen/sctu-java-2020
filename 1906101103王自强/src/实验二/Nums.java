package 实验二;

public class Nums {


    void sum(int[]nums){
        int sum=0;
        for (int i :nums) {
            sum=sum+i;
        }
        System.out.println(sum);
    }

    void maxIndex(int[]nums){
        int mxi=0;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]>nums[mxi]){
                mxi=i;
            }
        }
        System.out.println(mxi);
    }
    void minIndex(int[]nums){
        int mni=0;
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]<nums[mni]){
                mni=i;
            }
        }
        System.out.println(mni);
    }

    public static void main(String[] args) {

        int[] nums={1,2,8,9,7,5,6,48,99,10};

        Nums num=new Nums();

        num.sum(nums);
        num.maxIndex(nums);
        num.minIndex(nums);
    }
}
