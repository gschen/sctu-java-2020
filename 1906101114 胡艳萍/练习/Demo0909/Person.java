package Demo0909;

public class Person {
    String name = "huyanping";
    int age = 3;
    String sex = "女";
    void study(){
        System.out.println("正在敲代码");
    }
    void run(){
        System.out.println("我在跑步");
    }
    void movie(){
        System.out.println("我在看电影");
    }
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println(p.sex);
        p.study();
        p.run();
        p.movie();
    }
}
