package 团队Java0923;

import java.util.Arrays;

public class Test03 {
    //二维数组的遍历


        public static void main(String[] args) {
            int b[][]=new int[][] {{1},{2,3},{4,5,6}};
            for(int i=0;i<b.length;i++)
            {
                for(int j=0;j<b[i].length;j++)
                {
                    System.out.print(b[i][j]);
                }
                System.out.println();
            }
            String str[]=new String[] {"ab","cd","ef","yz"};
            Arrays.sort(str);
            int index=Arrays.binarySearch(str, "cd");
            System.out.println("cd的索引位置是："+index);

            int[]arr=new int[5];
            Arrays.fill(arr, 6);
            for (int i = 0; i < arr.length; i++) {
                System.out.println("第"+i+"个元素是："+arr[i]);
            }


        }


}


