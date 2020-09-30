package day0923.Work.Shape;

public class Circle extends Shape{
    double r;

    @Override
    void getArea() {
        System.out.println(r*r*3.14);
    }

    @Override
    void getLength() {
        System.out.println(2*r*3.14);
    }
}
