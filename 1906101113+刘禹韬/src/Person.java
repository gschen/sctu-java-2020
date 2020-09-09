public class Person {

    //属性
    String name = "张三";
    int age = 18;
    String birthday = "20020909";

    //方法
    void study(){
        System.out.println("我在学习");
    }

    void run(){
        System.out.println("我在跑步");
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.run();
        person.study();
    }
}
