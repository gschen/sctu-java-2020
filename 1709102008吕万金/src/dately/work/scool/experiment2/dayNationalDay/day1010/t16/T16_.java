package dately.work.scool.experiment2.dayNationalDay.day1010.t16;

public class T16_ {
    interface A {
        double op(int a, int b);
    }
    static class B implements A {
        public double op(int a, int b) {
            return a + b;
        }
    }
    static class C implements A {
        public double op(int a, int b) {
            return a - b;
        }
    }
    static class D implements A {
        public double op(int a, int b) {
            return a * b;
        }
    }
    static class E implements A {
        public double op(int a, int b) {
            return a * 1.0 / b;
        }
    }
    public static class T16 {
        public static void main(String[] args) {
            A sm;
            sm = new B();
            System.out.println(sm.op(3, 4));
            sm = new C();
            System.out.println(sm.op(3, 4));
            sm = new D();
            System.out.println(sm.op(3, 4));
            sm = new E();
            System.out.println(sm.op(3, 4));
        }
    }
}