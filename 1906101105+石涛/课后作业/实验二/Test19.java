package 实验二;

import java.util.Scanner;

public class Test19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 输入字符串
        StringBuffer buffer = new StringBuffer(in.next());
        String str = buffer.reverse().toString(); // 字符串倒序

        char[] s = str.toCharArray(); // 转换为char数组
        int value = 'a'-'A'; // 大小写的ascii码的差距
        for (int i = 0; i<s.length; i++){
            if ('a'<=s[i] && s[i]<='z'){
                s[i]=(char)(s[i]-value); // 小写变为大写
            }else if ('A'<=s[i] && s[i]<='Z'){
                s[i]=(char)(s[i]+value); // 大写变为小写
            }
        }
        String ans = new String(s); // 转换为字符串
        System.out.println(ans);
    }
}
