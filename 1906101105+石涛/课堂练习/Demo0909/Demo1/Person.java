package Demo0909.Demo1;

// 问题1：java类里面能写什么？
public class Person {
    //1.属性：姓名，年龄，性别，爱好，身高，等等。。。
    String name = "神奇的雷诺";
    String sex = "男";
    int age = 47 ;
    double high = 150.5;
    char max = 'S';

    /*    String name = "小明";
        int age = 10;
        double high = 140.5;
        char number = 'A';
        String talking = "Hello World !";*/

    //2.方法，行为：学习，看书，吃饭，睡觉等等。。。
    void study(){
        System.out.println("学习中");
    }

    void look_book(){
        System.out.println("看书中");
    }

    void eat(){
        System.out.println("吃饭中");
    }

    void sleep(){
        System.out.println("睡觉中");
    }

    public static void main(String[] args){
        Person person = new Person();
        person.study();
        person.look_book();
        person.eat();
        person.sleep();
    }

    /*
        多行注释
     */

    /**
     * 多行注释
     */

    //ctrl + N 搜索类

}
