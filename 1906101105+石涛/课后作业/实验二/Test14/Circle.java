package 实验二.Test14;

public class Circle extends Shape{
    // 属性
    double radius;

    //重写父类方法
    @Override
    double getArea() {
        return Math.PI*radius*radius;
    }
}
