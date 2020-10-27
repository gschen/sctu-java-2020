package edu.sctu.java.实验三;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test04 {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream= new FileInputStream("D://source/High.mp3");
            FileOutputStream fileOutputStream=new FileOutputStream("D://target/CopyHigh.mp3");
            int n =0;
            while((n=fileInputStream.read())!=-1){
                fileOutputStream.write(n);
            }
            fileInputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
