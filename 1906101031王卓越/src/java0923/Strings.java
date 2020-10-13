package java0923;

public class Strings {
    String a;
    String b;

    public static void main(String[] args) {
        String a = "1234";
        String b = "12345";
        if (a.compareTo(b) == -1){ //比较不同，不同返回值为-1
            System.out.println("字符串不同");
        }else {
            System.out.println("字符串相同");
        }
        System.out.println(a.equals(b)); //直接比较不同，返回bool
        System.out.println(a.length()); // 返回字符串的长度
        System.out.println(a.charAt(0)); // 返回的是相应下标的单个字符
    }
}
