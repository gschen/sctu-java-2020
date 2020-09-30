package java0930;


public class TryCatch {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(10/i);
            }
            catch (Exception e){
//                e.printStackTrace(); //继承关系
                System.out.println("0不能为被除数");
            }
        }

    }
}
