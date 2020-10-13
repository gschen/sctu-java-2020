package 实验二.Test06;

// 具有类型为double的半径、周长和面积属性，具有返回周长、面积的功能。
public class Circle {
    // 属性
    boolean radius;
    boolean C;
    boolean S;

    // 构造函数
    public Circle(boolean radius, boolean c, boolean s) {
        this.radius = radius;
        C = c;
        S = s;
    }

    // 返回周长
    public boolean returnPerimeter(){
        return C;
    }

    // 返回面积
    public boolean returnArea(){
        return S;
    }
}
