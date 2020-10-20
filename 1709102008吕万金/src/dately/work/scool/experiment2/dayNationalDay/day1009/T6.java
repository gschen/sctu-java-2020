package dately.work.scool.experiment2.dayNationalDay.day1009;

public class T6 {
    static class Circle{
        double r;
        double C;
        double S;

        Circle(double r){
            this.r=r;
            this.C=2*Math.PI*r;
            this.S=Math.PI*r*r;
        }
        double getC(){
            return C;
        }
        double getS(){
            return S;
        }
        void print1(){
            System.out.println("圆的面积："+this.S+"，周长："+this.C);
        }

    }

    static class Ladder{
        double sd,xd,g,S;
        Ladder(double sd,double xd,double g){
            this.sd=sd;
            this.xd=xd;
            this.g=g;
            S=(sd+xd)*g/2;
        }
        double getS(){
            return S;
        }
        void print2(){
            System.out.println("梯形的面积："+S);
        }
    }

    static class Triangle{
        private double size1;
        private double size2;
        private double size3;
        private boolean isTriangle;
        public Triangle(double size1, double size2, double size3) {
            this.size1 = size1;
            this.size2 = size2;
            this.size3 = size3;
            isTriangle=triangle();
        }
        void change(double size1,double size2,double size3){
            this.size1 = size1;
            this.size2 = size2;
            this.size3 = size3;

        }
        private boolean triangle()
        {
            if((size1+size2>size3)&&
                    (size1+size3>size2)&&
                    (size2+size3>size1)&&
                    (size1-size2<size3)&&
                    (size1-size3<size2)&&
                    size2-size3<size1)
                return true;
            return false;
        }
        public double getSize1() {
            return size1;
        }
        public void setSize1(double size1) {
            this.size1 = size1;
        }
        public double getSize2() {
            return size2;
        }
        public void setSize2(double size2) {
            this.size2 = size2;
        }
        public double getSize3() {
            return size3;
        }
        public void setSize3(double size3) {
            this.size3 = size3;
        }
        public boolean isTriangle() {
            return isTriangle;
        }
        public void setTriangle(boolean isTriangle) {
            this.isTriangle = isTriangle;
        }
        public double getArea() {
            if(isTriangle)
            {
                double c=getPermie()/2;
                return Math.sqrt(c*(c-size1)*(c-size2)*(c-size3));
            }
            throw new IllegalArgumentException("不能构成三角形");
        }
        public double getPermie() {
            if(isTriangle)
                return size1+size2+size3;
            throw new IllegalArgumentException("不能构成三角形");
        }
    }
    public static void main(String[] args) {
        Circle circle=new Circle(2);
        circle.print1();

        Ladder ladder=new Ladder(2,4,2);
        ladder.print2();

        Triangle triangle=new Triangle(1,2,3);
        System.out.println("周长："+triangle.getPermie());
        System.out.println("面积："+triangle.getArea());

        triangle.change(3,4,5);
        System.out.println("周长："+triangle.getPermie());
        System.out.println("面积："+triangle.getArea());


    }

}