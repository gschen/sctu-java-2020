package 实验二;

public class Test26 {
    public static void main(String[] args) {
        // 除数为0异常处理
        try {
            System.out.println(10/0);
        }catch (ArithmeticException e){
            System.out.println("错误，除数为0!");
        }finally {
            System.out.println("有错误!");
        }
    }
}
