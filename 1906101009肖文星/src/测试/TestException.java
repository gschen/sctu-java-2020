package 测试;
//throw方法抛出异常

public class TestException {
    public static void main(String[] args) {
        int a = 6;
        int b = 0;
        try {

            if (b == 0) throw new ArithmeticException(); // 通过throw语句抛出异常
            System.out.println("a/b的值是：" + a / b);
        }
        catch (ArithmeticException e) { // catch捕捉异常
            System.out.println("程序出现异常，变量b不能为0。");
        }finally {
            System.out.println("程序正常结束。");
        }

    }
}