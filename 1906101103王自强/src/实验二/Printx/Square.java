package 实验二.Printx;

public class Square extends Rectangle{
    double diagonal;

    @Override
    public void printMyWay() {
        super.printMyWay();
        System.out.println("对角线："+diagonal);
    }
    void getDiagonal(){
        this.diagonal=sideA*Math.pow(2,0.5);
    }
}
