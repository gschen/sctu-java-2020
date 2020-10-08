package 实验二.Test10;

public class BeiJingPeople extends People{
    // 重写方法

    @Override
    void eat() {
        System.out.println("BeiJingPeople is eating!");
    }

    @Override
    void sleep() {
        System.out.println("BeiJingPeople is sleeping!");
    }

    @Override
    void work() {
        System.out.println("BeiJingPeople is working!");
    }
}
