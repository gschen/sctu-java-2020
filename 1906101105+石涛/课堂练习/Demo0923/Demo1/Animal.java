package Demo0923.Demo1;

public class Animal {

    // 方法
    void eat(){
        System.out.println("Animal is eating !");
    }
    // 重载
    void eat(String name){
        System.out.println(name+" is eating !");
    }

    // 其它方法
    void sleep(){
        System.out.println("Animal is sleeping !");
    }
}
