package Demo0923.Demo1;

public class Dog extends Animal{

    // 重写
    @Override
    void eat() {
        System.out.println("Dog is eating !");
    }

    // 方法
    void run(){
        System.out.println("Dog is running !");
    }
}
