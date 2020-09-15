package day0909;

public class Test01 {

    //属性
    String name = "winky";
    int age = 18;
    char sex = '女';
    double height = 160;

    //方法
    void study(){
        System.out.println("学习");
    }
    void run(){
        System.out.println("跑步");
    }
    void movie(){
        System.out.println("电影");
    }

    public static void main(String[] args) {

        Test01 n = new Test01();
        System.out.println(n.name);
        System.out.println(n.age);
        System.out.println(n.sex);
        System.out.println(n.height);
        n.study();
        n.run();
        n.movie();
    }
}
