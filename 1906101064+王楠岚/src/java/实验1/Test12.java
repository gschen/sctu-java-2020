package java.实验1;
public class Test12 {
    public static void main(String[] args) {
        for (int i=100;i<=1000;i++) {
            String num = String.valueOf(i);
            int sum = 0;
            for (int o = 0; o < num.length(); o++) {
                sum += Math.pow(Integer.parseInt(String.valueOf(num.charAt(o))),3);
            }
            if (sum==i){
                System.out.println(i);
            }
        }
    }
}
