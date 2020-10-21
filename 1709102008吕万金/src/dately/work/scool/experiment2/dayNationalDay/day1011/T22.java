package dately.work.scool.experiment2.dayNationalDay.day1011;

import java.util.Scanner;

public class T22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串，（end表示结束）：");
		while (true) {
        String str = sc.nextLine();
        if ("end".equals(str)) {
            break;
        }
        int count = 0;
        char[] ch = str.toCharArray();
        for (int index = 0; index < ch.length; index++) {
            if (ch[index] >= 'A' && ch[index] <= 'Z') {
                ch[index] += 32;
            } else if (ch[index] >= 'a' && ch[index] <= 'z') {
                ch[index] -= 32;
            } else if (ch[index]>='0'&&ch[index]<='9'){
                ch[index] = '0';
            }else {
                ch[index]='#';
            }
        }
        System.out.println("转换后的字符串为：" + new String(ch));
    }
		sc.close();
}
}