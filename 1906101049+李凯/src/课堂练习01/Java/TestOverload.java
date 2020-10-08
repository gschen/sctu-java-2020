package 课堂练习01.Java;

public class TestOverload {
    public static void main(String[] args) {
        System.out.println("测试重载");
    }

    void adj(int n1, int n2) {
        n1=1;n2=2;
        int sum = n1 + n2;
        System.out.println(sum);
    }

    void adj(int n1, int n2, int n3) {
        n1=1;n2=2;n3=3;
        int sum = n1 + n2 + n3;
        System.out.println(sum);
    }

}
