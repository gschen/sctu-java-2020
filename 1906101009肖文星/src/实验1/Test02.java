package 实验1;

public class Test02 {
    public static void main(String[] args) {

        for(int i=100;i<=200;i++){
            if(i%3!=0){
                System.out.println(i);
            }else {
                continue;
            }
        }
    }
}
