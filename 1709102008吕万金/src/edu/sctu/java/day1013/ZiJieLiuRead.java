package edu.sctu.java.day1013;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class ZiJieLiuRead {
    public static void main(String[] args) {
        try {//shift +enter可以直接换行

            InputStream is=new FileInputStream("D:\\output.txt");

//            int c=is.read();//只读取第一个字节.
//            System.out.println((char)c);
            int b;
            while ((b=is.read())!=-1){
                System.out.print((char)b);
            }
            is.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
