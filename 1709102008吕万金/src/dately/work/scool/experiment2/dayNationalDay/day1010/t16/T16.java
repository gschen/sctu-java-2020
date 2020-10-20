package dately.work.scool.experiment2.dayNationalDay.day1010.t16;

abstract class A{
    abstract double op(int a,int b);
}

class B extends A{
    double op(int a, int b) {
        return a+b;
    }
}
class C extends A{

    double  op(int a, int b) {

        return a-b;
    }
}
class D extends A{
    double  op(int a, int b) {
        return a*b;
    }
}
class E extends A{
    double  op(int a, int b) {
        return a*1.0/b;
    }
}

class T16{
    public static void main(String[] args){
        B b=new B();
        C c=new C();
        D d=new D();
        E e=new E();
        System.out.println("加："+b.op(3,4)+"，减："+c.op(3,4)+"，乘："+d.op(3,4)+"，除："+e.op(3,4));
    }
}




