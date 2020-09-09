import com.sun.source.tree.NewArrayTree;

public class Person {
    //CTRL + N 搜索类
    //1.属性：姓名，年龄，性别等。
     String name = "蓝昊杰";
     int age = 18;
     String sex = "男";
     double height = 175.6;
     int weight = 80;
    //2.方法，行为：学习，跑步，看电影等。
    void eat(){
        System.out.println(name+"在吃饭");
    }
    void study(){
        System.out.println(name+"在学习");
    }
    void run(){
        System.out.println(name+"在跑步");
    }
    void watch(){
        System.out.println(name+"在看电影");
    }

    public static void main(String[] args) {
        Person s = new Person();
        System.out.println(s.name);
        System.out.println(s.sex);
        System.out.println(s.age);
        System.out.println(s.height);
        System.out.println(s.weight);
        s.eat();
        s.run();
        s.study();
        s.watch();
    }
    /*
    多行注释
     */
}
