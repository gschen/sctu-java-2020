package 实验二;

public class W6 {
    public class Triangle{
        double side1;
        double side2;
        double side3;
        Boolean isTriangle=side1+side2>side3&&side1+side3>side2&&side3+side2>side2;
    }
    public class Ladder{
        double uBase;
        double dBase;
        double high;
        double area;

        double getArea(){
            this.area=(uBase+dBase)*high/2;
            return this.area;
        }
    }
    public class Circle{
        double r;
        double perimeter;
        double area;

        double getArea(){
            this.area=3.14*r*r;
            return this.area;
        }
        double getPerimeter(){
            this.perimeter=2*r*3.14;
            return this.perimeter;
        }
    }
}
