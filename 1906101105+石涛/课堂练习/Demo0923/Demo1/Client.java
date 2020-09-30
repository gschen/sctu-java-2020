package Demo0923.Demo1;

public class Client {
    public static void main(String[] args) {
        // 普通实例化
        System.out.println("普通实例化:");
        Dog dog =new Dog();
        dog.eat();
        dog.run();

        // 向上转型
        System.out.println("向上转型:");
        Animal dog1 = new Dog();
        dog1.eat();
        dog1.eat("Animal"); // Animal 的重载的方法
        dog1.sleep(); // Animal 的基本方法

        // 向下转型
        System.out.println("向下转型:");
        Dog dog2 = (Dog) dog1;
        dog2.eat();
        dog2.run(); // Dog 的基本方法
    }
}
