package 测试;
//throws方法抛出异常
public class Shoot {
    static void pop()throws NegativeArraySizeException{
        int[] arr = new int[-3];
    }
    public static void main(String[] args) {
        try{
            pop();
        }catch(NegativeArraySizeException e){
            System.out.println("pop()方法抛出的异常");
        }
        System.out.println("程序结束");
    }

}