package Demo0929.Demo1;

public class StringTest {
    public static void main(String[] args) {
        String hello = "Hello World !";

        System.out.println(hello.equals("Hello World !")); // 判断是否相同
        System.out.println(hello.length()); // 字符串长度
        System.out.println(hello.replace("Hello","Morning")); // 替换字符串
        System.out.println(hello.split(" ")[1]); // 切割字符串，并储存在列表中
        System.out.println(hello.isEmpty()); // 判断是否为空字符串
    }
}
