package demo0922;

public class Client {
    public static void main(String[] args) {
        Father chen = new Father();
        Father li = new Son();


        li.study();
        chen.study();
        li.study(5);
        li.study("飞飞");
       // li.run(); 子类继承了父类的方法，但是子类独有的方法不能在实例化的时候运用
    }
}
