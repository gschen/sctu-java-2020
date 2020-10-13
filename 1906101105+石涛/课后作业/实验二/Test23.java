package 实验二;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test23 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入您的下一个生日日期(格式为：xxxx/xx/xx): ");
        String s = sc.nextLine(); // 输入生日

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date date = sdf.parse(s);
        SimpleDateFormat sdf2 = new SimpleDateFormat("EEEE");
        String week = sdf2.format(date);

        // 获得当前日期的毫秒值以及解析出来的毫秒只差；
        Date d = new Date();
        long l = date.getTime()-d.getTime();

        //根据毫秒值转换为对应的天数
        System.out.print("您从现在到下一个生日"+s+"还有："+l/(1000*60*60*24)+"天");
        System.out.println(",是："+week);
    }
}
