package dately.work.scool.experiment3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入文件路径:");
        String str=scanner.next();

        try {
            InputStream is=new FileInputStream(str);

            int c;
            while((c=is.read())!=-1){
                System.out.print((char)c);

            }
            is.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
