package dately.work.scool.experiment3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class T4 {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream= new FileInputStream("D:\\source\\High.mp3");
            FileOutputStream fileOutputStream=new FileOutputStream("D:\\target\\CopyHigh.mp3");
            int n =0;
            while((n=fileInputStream.read())!=-1){
                fileOutputStream.write(n);
            }
            fileInputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}