package 实验二;

import java.util.Scanner;

public class Test20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 输入
        String input = in.next();

        char[] s = input.toCharArray(); // 转换为char数组
        char[] ans = new char[s.length]; // 用于存储数字
        for (int i = 0; i < s.length; i++) {
            if ('0'<=s[i] && s[i]<='9'){
                ans[i] = s[i];
            }
        }
        String output = new String(ans); // 转换为字符串
        System.out.println(output);
    }
}
