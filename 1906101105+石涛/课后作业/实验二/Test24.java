package 实验二;

import java.util.Calendar;
import java.util.Scanner;

public class Test24 {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);

        // 输入
        String start = in1.next(); // 开始时间
        String end = in2.next(); // 结束时间

        // 设置时间
        Calendar c1=Calendar.getInstance();
        c1.set(2018, 12-1,12);
        Calendar c2=Calendar.getInstance();
        c2.set(2018, 12-1,17);

        long t1=c1.getTimeInMillis(); // 获得毫秒
        long t2=c2.getTimeInMillis(); // 获得毫秒

        long days=(t2-t1)/(24*60*60*1000); // 用毫秒计算天数
        System.out.println(days);
    }
}
