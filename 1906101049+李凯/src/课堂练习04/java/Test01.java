package 课堂练习04.java;

public class Test01 {
    public static void main(String[] args) throws IndexOutOfBoundsException, InterruptedException {
        int i = 0;
        while(true) {
            System.out.println(i++);
            Thread.sleep(10);
            try {
                if (i == 5) {
                    System.out.println(10/0);
                }
            }catch(Exception e){
                System.out.println("Error");
            }
        }
    }

    public void a() {
    }
}
