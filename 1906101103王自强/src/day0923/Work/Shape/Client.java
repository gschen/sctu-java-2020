package day0923.Work.Shape;


public class Client {
    public static void main(String[] args) {
        Circle circle=new Circle();

        circle.r=4;

        circle.getArea();

        Rectangle rectangle=new Rectangle();

        rectangle.sideA=4;
        rectangle.sideB=5;
        rectangle.getArea();
    }
}
