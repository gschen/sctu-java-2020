package sctu.java.experiment.First01;
//  使用continue语句实现：将100-300之间的不能被3整除的数输出。
public class Two {
    public static void main(String[] args) {
        for(int i=100;i<300;i++){
            if(i%3==0)
                System.out.println(i);
                continue;
        }
    }
}

