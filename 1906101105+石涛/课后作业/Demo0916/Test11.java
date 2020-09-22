package Demo0916;

import java.util.Scanner;

// 判断回文数
public class Test11 {
    public static void main(String[] args) {
        // 输入
        Scanner in = new Scanner(System.in);
        String a = in.next();

        String b =new StringBuffer(a).reverse().toString(); // 字符串的反转
        if (a.equals(b)){ // 判断字符串是否相同
            System.out.println("输入值为回文数！");
        }
        else {
            System.out.println("输入值不为回文数！");
        }
    }
}
