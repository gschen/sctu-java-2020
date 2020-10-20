package 实验二;


public class Circular {

    double r;
    final double pi=3.1415926;

    void getL(){
        System.out.println(2*pi*r);
    }
    void getS(){
        System.out.println(pi*r*r);
    }

    public static void main(String[] args) {
        Circular circular=new Circular();

        circular.r=7;

        circular.getL();
        circular.getS();
    }
}
