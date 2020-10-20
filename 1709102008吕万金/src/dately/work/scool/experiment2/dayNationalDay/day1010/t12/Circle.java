package dately.work.scool.experiment2.dayNationalDay.day1010.t12;

public class Circle implements Shape{
    double r;
    Circle(double r){
        this.r=r;

    }

    @Override
    public double getL() {
        return 2*Math.PI*r;
    }

    @Override
    public double getArea() {
        return Math.PI*r*r;
    }
}
