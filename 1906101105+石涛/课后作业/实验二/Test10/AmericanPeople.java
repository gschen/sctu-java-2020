package 实验二.Test10;

public class AmericanPeople extends People{
    // 重写方法

    @Override
    void eat() {
        System.out.println("American is eating!");
    }

    @Override
    void sleep() {
        System.out.println("American is sleeping!");
    }

    @Override
    void work() {
        System.out.println("American is working!");
    }
}
