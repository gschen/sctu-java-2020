package dately.work.scool.experiment2.dayNationalDay.day1010.t11;

public class Rectangle implements PrintX{
    double c,k,area,l;

    Rectangle(double c,double k){
        this.c=c;
        this.k=k;
    }
    double getL(){
        return l=2*(c+k);
    }
    double getArea(){
        return area=c*k;
    }

    @Override
    public void printMyWay() {
        System.out.println(
                "矩形长："+this.c+"\n"+
                "矩形宽："+this.k+"\n"+
                "矩形周长："+getL()+"\n"+
                "矩形面积："+getArea()+"\n"
        );
    }
}

