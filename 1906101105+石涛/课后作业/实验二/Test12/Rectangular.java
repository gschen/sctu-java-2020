package 实验二.Test12;

public class Rectangular extends Shape{
    // 属性
    int longs;
    int wide;

    // 重写父类方法
    @Override
    void perimeter() {
        System.out.println("周长："+2*(longs+wide));
    }

    @Override
    void area() {
        System.out.println("面积："+longs*wide);
    }
}
