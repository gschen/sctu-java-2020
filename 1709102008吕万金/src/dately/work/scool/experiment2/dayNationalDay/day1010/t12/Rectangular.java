package dately.work.scool.experiment2.dayNationalDay.day1010.t12;

public class Rectangular implements Shape{
    double c,k;

    Rectangular(double c,double k){
        this.c=c;
        this.k=k;
    }

    @Override
    public double getL() {
        return 2*(c+k);
    }

    @Override
    public double getArea() {
        return c*k;
    }
}
