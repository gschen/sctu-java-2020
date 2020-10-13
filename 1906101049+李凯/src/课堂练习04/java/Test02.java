package 课堂练习04.java;
public class Test02 {
    void a(){
        try{
        b();
    }catch(Exception e){
            System.out.println("a处理错误");
        }
    }
    void b(){
        try{
            System.out.println(10/0);
        }catch(Exception e){
            System.out.println("b处理错误");
            throw new ArithmeticException();
        }
    }
    public static void main(String[] args) {
        Test02 c = new Test02();
        c.a();
    }
}
