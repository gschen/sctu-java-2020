package Demo0930.Demo1;

public class Test02 {
    void a(){
        try{
            b(); // b 出错，处理它抛出的错误
        }catch (Exception e){
            System.out.println("a处理错误！");
        }
    }
    void b(){
        try {
            System.out.println(1/0);
        }catch (Exception e){
            throw new NullPointerException(); // 向上级抛出错误，交给上级处理
        }
    }

    public static void main(String[] args) {
        Test02 test02 = new Test02();

        test02.a();
    }
}
