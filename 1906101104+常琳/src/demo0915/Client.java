package demo0915;

public class Client {
    String name;
    int age;
    public static void main(String[] args) {
        Client chen = new Client();
        chen.name = "chen";
        chen.age = 18;
        System.out.println("老师姓："+chen.name+",年龄："+chen.age);
    }
}
