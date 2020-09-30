package day0923.Work.Printx;

public class Client {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();

        rectangle.sideB=4;
        rectangle.sideA=6;

        rectangle.getArea();
        rectangle.getLength();
        rectangle.printMyWay();

        Square square=new Square();

        square.sideA=4;
        square.sideB=square.sideA;

        square.getArea();
        square.getLength();
        square.getDiagonal();
        square.printMyWay();
    }
}
