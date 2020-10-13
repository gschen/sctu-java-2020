package 实验二.Shape;

public class Rectangle extends Shape{
    double sideA;
    double sideB;

    @Override
    void getArea() {
        System.out.println(sideA*sideB);
    }

    @Override
    void getLength() {
        System.out.println(2*(sideA+sideB));
    }
}
