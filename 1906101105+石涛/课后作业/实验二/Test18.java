package 实验二;

public class Test18 {
    public static void main(String[] args) {
        String name = "My name is Network crazy";

        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(name.length()-1));
        System.out.println(name.split(" ")[0]);
        System.out.println(name.indexOf("crazy"));
    }
}
