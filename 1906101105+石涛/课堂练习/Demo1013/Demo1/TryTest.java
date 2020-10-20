package Demo1013.Demo1;

public class TryTest {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        }catch (ArithmeticException e){
            System.out.println("除数不能为0！");
        }catch (Exception e){
            System.out.println("出错了！");
        }
    }
}
