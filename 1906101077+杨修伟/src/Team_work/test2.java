package Team_work;
//字符串
public class test2 {
    public static void main(String[] args) {
        //1.Java String 类

        //<1>创建字符串最简单的方式如下:
        String greeting = "字符串String";
        //<2>字符数组
        char[] helloArray = {'b', 'a', 'i', 'd', 'u'};
        String helloString = new String(helloArray);
        System.out.println(helloString);
        //<3>字符串长度
        String site = "www.baidu.com";
        int len = site.length();
        System.out.println("长度:" + len);
        //<4>连接字符串  string1.concat(string2);
        String string1 = "百度网址：";
        System.out.println("1、" + string1 + "www.baidu.com");
        System.out.println("2、"+string1.concat("www.baidu.com"));

        //<5>charAt方法  返回指定索引处的 char 值。
        String s = "www.baidu.com";
        char r = s.charAt(6);
        System.out.println(r);

        //<6>int compareTo(Object o)
        String str1 = "Strings";
        String str2 = "Strings";
        String str3 = "Strings123";

        int result = str1.compareTo( str2 );
        System.out.println(result);

        result = str2.compareTo( str3 );
        System.out.println(result);

        result = str3.compareTo( str1 );
        System.out.println(result);


        //2.Java StringBuffer 和 StringBuilder类
        //当对字符串进行修改的时候，需要使用 StringBuffer 和 StringBuilder 类。
        //
        //和 String 类不同的是，StringBuffer 和 StringBuilder 类的对象能够被多次的修改，并且不产生新的未使用对象。
        //
        //StringBuilder 类在 Java 5 中被提出，它和 StringBuffer 之间的最大不同在于 StringBuilder 的方法不是线程安全的（不能同步访问）。
        //
        //由于 StringBuilder 相较于 StringBuffer 有速度优势，所以多数情况下建议使用 StringBuilder 类。然而在应用程序要求线程安全的情况下，则必须使用 StringBuffer 类。

        //<1>StringBuffer
        StringBuffer sBuffer = new StringBuffer("百度官网：");
        sBuffer.append("www");
        sBuffer.append(".baidu");
        sBuffer.append(".com");
        System.out.println(sBuffer);








    }


}
