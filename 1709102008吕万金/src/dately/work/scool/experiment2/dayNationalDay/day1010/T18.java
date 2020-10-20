package dately.work.scool.experiment2.dayNationalDay.day1010;

public class T18 {
    public static void main(String[] args) {
        String name="My name is Network crazy";
        System.out.println("字符串长度："+name.length());
        System.out.println("打印字符串的第一个字符:"+name.charAt(0));
        System.out.println("打印字符串的最后一个字符:"+name.charAt(name.length()-1));
        System.out.println("打印字符串的第一个单词:"+name.substring(0,name.indexOf(" ")));
        System.out.println("打印字符串crazy的位置（从0开始编号的位置）:"+name.indexOf("crazy"));

    }
}
