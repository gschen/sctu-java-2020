package 实验二;

import java.util.Arrays;

// 10个元素组成的一维数组，输出该数组中的最大值、最小值、所有元素总和，以及最大值和最小值在该数组中的位置。
public class Test17 {
    // 方法
    // 最大值
    void max(int[] list){
        Arrays.sort(list);
        System.out.println(list[9]);
    }
    // 最小值
    void min(int[] list){
        Arrays.sort(list);
        System.out.println(list[0]);
    }
    // 总和
    void sum(int[] list){
        int sums=0;
        for (int i : list){
            sums+=i;
        }
        System.out.println(sums);
    }
    // 最大值位置
    void maxPosition(int[] list){
        Arrays.sort(list);
        int max = list[9];
        for (int i = list.length-1;i>=0;i--){
            if (list[i]==max){
                System.out.println(i);
            }else {
                break;
            }
        }
    }
    // 最小值位置
    void minPosition(int[] list){
        Arrays.sort(list);
        int min = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i]==min){
                System.out.println(i);
            }else {
                break;
            }
        }
    }


    public static void main(String[] args) {
        // 定义数组
        int[] nums = {5,7,4,5,7,8,6,4,5,7};
        // 实例化
        Test17 t = new Test17();

        t.max(nums);
        t.min(nums);
        t.sum(nums);
        t.maxPosition(nums);
        t.minPosition(nums);
    }
}
