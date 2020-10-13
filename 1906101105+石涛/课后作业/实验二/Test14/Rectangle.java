package 实验二.Test14;

public class Rectangle extends Shape{
    // 属性
    double longs;
    double wide;

    // 重写父类方法
    @Override
    double getArea() {
        return longs*wide;
    }
}
