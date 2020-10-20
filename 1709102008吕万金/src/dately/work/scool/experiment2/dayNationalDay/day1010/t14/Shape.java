package dately.work.scool.experiment2.dayNationalDay.day1010.t14;

abstract class Shape {
    abstract double getArea();
}
class Rectangle extends Shape{
    double c,k;

    Rectangle(double c,double k){
        this.c=c;
        this.k=k;
    }
    @Override
    double getArea() {
        return c*k;
    }
}
class Circle extends Shape{
    double r;

    Circle(double r){
        this.r=r;
    }

    @Override
    double getArea() {
        return r*r*Math.PI;
    }
}

class T14{
    public static void main(String[] args) {
        Circle circle=new Circle(3);
        System.out.println("圆面积："+circle.getArea());

        Rectangle rectangle=new Rectangle(3,4);
        System.out.println("矩形："+rectangle.getArea());
    }

}