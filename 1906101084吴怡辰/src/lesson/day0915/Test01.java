package lesson.day0915;

public class Test01 {
    public static void main(String[] args) {
//        int a = 1;
//        int b = 3;
//
//        System.out.println(a/b);
        Test01 c = new Test01();
        c.division();
        c.add();
    }

    int m = 1;
    int n = 5;

    void division(){
        System.out.println(m/n);

    }

    void add(){
        System.out.println(m+n);

    }

}
