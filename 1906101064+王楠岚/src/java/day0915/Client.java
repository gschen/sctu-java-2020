package java.day0915;

public class Client {
    public static void main(String[] args) {
        Person jiang = new Person();
        jiang.name = "八里公路";
        jiang.age = 18;
        jiang.study();
        Person jiang2 = new Person("jianglaihong",18);
        System.out.println(jiang.name);
        System.out.println(jiang2.name);
        Student zhangsan = new Student();
        zhangsan.study();
    }
}
