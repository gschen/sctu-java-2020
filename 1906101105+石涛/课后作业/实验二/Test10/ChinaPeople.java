package 实验二.Test10;

public class ChinaPeople extends People{
    // 重写方法

    @Override
    void eat() {
        System.out.println("Chinese is eating!");
    }

    @Override
    void sleep() {
        System.out.println("Chinese is sleeping!");
    }

    @Override
    void work() {
        System.out.println("Chinese is working!");
    }
}
