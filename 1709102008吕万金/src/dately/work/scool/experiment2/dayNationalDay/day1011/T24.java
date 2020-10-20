package dately.work.scool.experiment2.dayNationalDay.day1011;

import java.util.Calendar;
import java.util.Scanner;

public class T24 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        String start = sc1.next();
        String end = sc2.next();

//设置两个时间
        Calendar m = Calendar.getInstance();
        m.set(Integer.parseInt(start.substring(0,4)),Integer.parseInt(start.substring(4,6))-1,Integer.parseInt(start.substring(6)));
        Calendar n = Calendar.getInstance();
        n.set(Integer.parseInt(end.substring(0,4)),Integer.parseInt(end.substring(4,6))-1,Integer.parseInt(end.substring(6)));
//获得毫秒
        long t1 = m.getTimeInMillis();
        long t2 = n.getTimeInMillis();

//        计算天数：
        long day = (t2 - t1) / (24 * 60 * 60 * 1000);
        System.out.println("这两个时间之差是："+day+"天");
    }

}
