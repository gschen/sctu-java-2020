package 实验二.Test12;

public class Circle extends Shape{
    // 属性
    double radius;

    // 重写父类方法
    @Override
    void perimeter() {
        System.out.println("周长："+2*Math.PI*radius);
    }

    @Override
    void area() {
        System.out.println("面积："+Math.PI*radius*radius);
    }
}
