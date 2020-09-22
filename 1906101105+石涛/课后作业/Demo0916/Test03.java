package Demo0916;

// 用break语句实现记数：从1-100，当数到78时程序终止。
public class Test03 {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if (i==78){
                System.out.println("78了，停止运行");
                break;
            }
        }
    }
}
