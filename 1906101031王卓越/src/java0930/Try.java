package java0930;

public class Try {

    void a(){
        try {
            b();
        }catch (Exception e){
            System.out.println("A处理错误");
        }
    }

    void b(){
        try {
            System.out.println(10/0);
        }catch (Exception e){
            throw new ArithmeticException();//向上抛处理
        }
    }

    public static void main(String[] args) {
        Try t = new Try();
        t.a();
    }
}
