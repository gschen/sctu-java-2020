package dately.work.scool.experiment3;

import java.io.*;
import java.util.Scanner;
public class T5 {
    public static void main(String[] args) {
        char[] a;
        Scanner sc = new Scanner(System.in);
        String m = sc.next();
        try {
            OutputStream outputStream = new FileOutputStream("D:\\test05.txt");
            a = m.toCharArray();
            for (int i=0;i<a.length;i++){
                a[i] = (char)(a[i]+1);
                outputStream.write(a[i]);
            }
            outputStream.close();
            InputStream inputStream = new FileInputStream("D:\\test05.txt");
            int n;
            while ((n=inputStream.read())!=-1){
                System.out.print((char)(n-1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}