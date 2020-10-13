package 实验二;

import java.util.Scanner;

// 将字符串中的所有大写字母变成小写字母，数字用0 来代替，其他符号用#代替。
public class Test22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 输入
        String input = in.next();

        char[] a = input.toLowerCase().toCharArray(); // 字符转换为小写并且转换为数组
        for (int i = 0; i < a.length; i++) {
            if ('0'<=a[i] && a[i]<='9'){
                a[i] = '0';
            }else if ('a'>a[i] || a[i]>'z'){
                a[i] = '#';
            }
        }
        System.out.println(new String(a));
    }
}
