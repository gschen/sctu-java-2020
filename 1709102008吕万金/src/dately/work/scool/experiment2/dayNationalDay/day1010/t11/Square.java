package dately.work.scool.experiment2.dayNationalDay.day1010.t11;

public class Square extends Rectangle{
    Square(double c, double k) {
        super(c, k);
    }

    @Override
    double getL() {
        return super.getL();
    }

    @Override
    double getArea() {
        return super.getArea();
    }

    double diagonal(){
        return Math.sqrt(c*c+k*k);
    }

    @Override
    public void printMyWay() {
        System.out.println(
                "正方形边长是："+this.c+"\n"+
                "正方形周长是："+getL()+"\n"+
                "正方形面积是："+getArea()+"\n"+
                "正方形对角线是："+diagonal()+"\n"
        );
    }

    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(3,4);
        rectangle.printMyWay();

        Square square=new Square(2,2);
        square.printMyWay();
    }
}
