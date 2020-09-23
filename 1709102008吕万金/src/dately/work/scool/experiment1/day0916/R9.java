package dately.work.scool.experiment1.day0916;

public class R9 {
    int line;

    void run() {
        //从大写字母A开始
        char A = 'A';
        //循环的次数i=1代表第一行
        int line = 4;
        for (int i = 1; i <= line; i++) {
            //打印空格
            for (int k = 1; k <= (line - i); k++)
                System.out.print(" ");
            //打印字母
            for (int j = 0; j < i; j++) {
                System.out.print(A++);
                System.out.print(" ");
            }
            //换行
            System.out.println();
        }
        //逆向打印
        for (int i = line; i >= 1; i--) {
            //打印空格
            for (int k = 1; k <= (line - i); k++)
                System.out.print(" ");
            //打印字母
            for (int j = 0; j < i; j++) {
                System.out.print(A++);
                System.out.print(" ");
            }
            //换行
            System.out.println();
        }
    }

    public static void main(String[] args) {
        R9 text=new R9();
        text.line=4;
        text.run();
    }
}
























        //        char s = 'A';
//        int num = 4;
//        for (int i = 1; i <= num; i++) {
//            for (int j = 0; j < (num - i); j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= (i*2 - 1); j++) {
//                System.out.print(s);
//                int v = (int) s;
//                v++;
//                s = (char) v;
//            }
//            System.out.println();
//
//        }
//        for (int i = num - 1; i > 0; i--) {
//            for (int j = 0; j < num - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < i * 2 - 1; j++) {
//                System.out.print(s);
//                int v = (int) s;
//                v++;
//                s = (char) v;
//            }
//            System.out.println();
//        }
//    }
//    }
//        int num = 4;//代表bai上面有du4行zhi，总共dao是7行
//        for (int i = 0; i < num; i++) {
//            for (int j = 0; j < num - 1 - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < 2 * i + 1; j++) {
//                if (j == 2 * i) {
//                    System.out.println("*");
//                } else if (i == num - 1 && j == i) {
//                    System.out.print("+");
//                } else {
//                    System.out.print("*");
//                }
//            }
//        }
//        for (int i = num - 2; i >= 0; i--) {
//            for (int j = 0; j < num - 1 - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < 2 * i + 1; j++) {
//                if (j == 2 * i) {
//                    System.out.println("*");
//                } else {
//                    System.out.print("*");
//                }
//            }
//        }
//    }
//}