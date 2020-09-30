package day0923;

public class Demo01 {
    String name;

    void eat(){
        System.out.println("正在吃");

    }

    void eat(String name){
        System.out.println(name+"正在吃");

    }

    public static void main(String[] args) {
        Demo01 a=new Demo01();
        a.name="可乐";
        a.eat();
        a.eat("aa");
    }
}
