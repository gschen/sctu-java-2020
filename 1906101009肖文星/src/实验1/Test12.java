package 实验1;

public class Test12 {
    public static void main(String[] args) {



        for (int i = 100; i < 1000; i++) {
            //取出个位
            int g = i%10;
            //取出十位
            int s = i/10%10;
            //取出百位
            int b = i/100;
            //判断每个位上的立方和是否等于它自己,如果是则打印出该数字
            if (g*g*g+s*s*s+b*b*b==i){


                System.out.println(i);
            }
        }

    }
}
