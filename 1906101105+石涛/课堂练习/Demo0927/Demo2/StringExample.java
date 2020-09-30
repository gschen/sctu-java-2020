package Demo0927.Demo2;

public class StringExample {
    public static void main(String[] args) {
        String name;
        String hello = new String("Hello World !");

        System.out.println(hello.length()); // 长度
        System.out.println(hello.charAt(4)); // 对应位置的char
        System.out.println(hello.equals("hello")); // 字符串的对比
        System.out.println(hello.equals("Hello World !"));
        System.out.println(hello.isEmpty()); // 判断是否为空
        System.out.println(hello.split(" ")[1]); // 切割字符串，存入列表
        System.out.println(hello.replace("Hello","Morning")); //替换字符串
        System.out.println(hello.compareTo("Hello World ! ")); // 对比与原来的字符串有那些不同的个数
    }
}
