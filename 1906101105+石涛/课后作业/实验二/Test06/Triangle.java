package 实验二.Test06;

// 具有类型为double的三个边，以及周长、面积属性，Triangle类具有返回周长、面积以及修改三个边的功能。
// 另外，Triangle类还具有一个Boolean型的属性，该属性用来判断三个属能否构成一个三角形。
public class Triangle {
    double a;
    double b;
    double c; // 边
    double C; // 周长
    double S; // 面积

    // 构造函数
    public Triangle(double a, double b, double c, double c1, double s) {
        this.a = a;
        this.b = b;
        this.c = c;
        C = c1;
        S = s;
    }

    // 修改三边
    public void setA(double a) {
        this.a = a;
    }
    public void setB(double b) {
        this.b = b;
    }
    public void setC(double c) {
        this.c = c;
    }

    // 判断是否构成三角形
    public boolean judgeTriangle(){
        return a+b>c & a+c>b & b+c>a;
    }
}
