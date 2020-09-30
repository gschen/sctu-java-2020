package day0927;

public class StringExample {
    public static void main(String[] args) {
        String name= new String("hello,world");

        System.out.println(name.equals("hello,world"));//字符串对比
        System.out.println(name.length());//字符串长度
        System.out.println(name.charAt(0));//返回给定字符串下标的字符
        System.out.println(name.codePointAt(0));//返回给定下标字符的Unicode值
        System.out.println(name.compareTo("1"));//对象排序的比较器
        System.out.println(name.isEmpty());//返回字符串是否为空

    }
}
