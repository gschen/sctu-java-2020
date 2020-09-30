package Demo0930.Demo1;

public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                try{
                    System.out.println(10/0); // 出错的代码
                }catch (Exception e){
                    // e.printStackTrace(); // 抛出错误
                    // 也可以使用直接打印
                    System.out.println("出错了！");
                }
            }
            System.out.println(i);
        }
    }
}
