package 实验二;

import java.util.Scanner;

public class Test21 {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);

        // 输入
        String longs = in1.next();
        char m = in2.next().charAt(0);

        char[] list = longs.toCharArray();
        int ans = 0; // 统计数目
        for (int i = 0; i < list.length; i++) {
            if (list[i]==m){
                ans+=1;
            }
        }
        System.out.println(ans);
    }
}
