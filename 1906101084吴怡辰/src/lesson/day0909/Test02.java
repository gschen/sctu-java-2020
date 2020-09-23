package lesson.day0909;

public class Test02 {
    public static void main(String[] args) {

        int a = 1;
        int b = 3;
        System.out.println(a/b); // 0.3333结果取整


        double c = 1;
        double d = 3;
        System.out.println(c/d); // 保留小数位


        System.out.println(-100%3);


        int m = 2;
        int n = 4;
        System.out.println(!(++m!=n--));


        // 生成 50~100 的随机数
        int num = (int) (Math.random( )*50+50);
        System.out.println(num);

    }


}
