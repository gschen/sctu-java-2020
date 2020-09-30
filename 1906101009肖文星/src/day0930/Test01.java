package day0930;

public class Test01 {
    public static void main(String[] args) {
        int i = 0;
        while (i<=10){

            try {
                System.out.println(10/i);

                if(i==10){
                    break;
                }

            }catch (Exception e){
                System.out.println("出错了");
            }
            i++;
        }
    }
}
