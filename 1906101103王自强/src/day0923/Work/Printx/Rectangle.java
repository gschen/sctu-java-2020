package day0923.Work.Printx;

public class Rectangle implements Printx{

    double sideA;
    double sideB;
    double area;
    double length;
    @Override
    public void printMyWay() {
        System.out.println("边长：" + sideA+","+sideB);
        System.out.println("面积：" + area);
        System.out.println("周长：" + length);
    }
    void getArea(){
        this.area=sideA*sideB;
    }
    void getLength(){
        this.length=(sideA+sideB)*2;
    }
}
