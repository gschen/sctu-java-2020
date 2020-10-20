package edu.sctu.java.day0930;

//使用try语句解决报错问题

public class Text01 {
    public static void main(String[] args) {
        int i = 0;

        while (true) {
            System.out.println(i++);

            try {
                if (i == 5) {
                    System.out.println(10 / 0);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
//Java异常处理机制（try。。catch语句）
