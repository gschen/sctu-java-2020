import com.sun.org.apache.bcel.internal.generic.NEW;
public class Person {
    //属性
    String name = "八里公路";
    int age = 3;
    String sex = "男";
    void study(){
        System.out.println("我在写代码");
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
        //p.study();
        p.run();
    }
}


