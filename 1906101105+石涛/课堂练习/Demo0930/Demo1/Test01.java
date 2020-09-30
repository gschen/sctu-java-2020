package Demo0930.Demo1;

public class Test01 {
    public static void main(String[] args) throws InterruptedException {
        int i = 1;
        while (i<10){
            System.out.println(i++); // i++ 等价于 i=i+1

            Thread.sleep(100); // 减慢程序运行的速度
            try{
                if (i==5){
                    System.out.println(1/0);
                }
            }catch (Exception e){
                System.out.println("出错了！");
            }
        }
    }
}
