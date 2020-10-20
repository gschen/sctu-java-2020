package dately.work.scool.experiment2.dayNationalDay.day1010.t12;

public class T12 {
    public static void main(String[] args) {
        Rectangular rectangular=new Rectangular(3,4);
        System.out.println(
                "矩形周长："+rectangular.getL()+"\n"+
                "矩形面积："+rectangular.getArea()+"\n"
        );

        Circle circle=new Circle(3);
        System.out.println(
                "圆周长："+circle.getL()+"\n"+
                "圆面积："+circle.getArea()+"\n"
        );
    }
}
