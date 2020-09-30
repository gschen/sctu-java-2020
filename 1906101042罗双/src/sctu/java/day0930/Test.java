package sctu.java.day0930;

public class Test {

    public static void main(String[] args) {
        int i =0;
        while(true){

            try{
                System.out.println(i++);
                Thread.sleep(100);
                if (i==5){
                    System.out.println(10/0);
                }
            }catch (NullPointerException e){
                System.out.println("除零错误");
            }catch (Exception e){
                System.out.println("出错了！");
            }
        }

    }
}
