package edu.sctu.java.day1013;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Test04 {
    public static void main(String[] args) throws IOException {
        //1.字节流方式 写文件
        try{
            OutputStream os = new FileOutputStream("E:\\output.txt"); //ctrl+P

            os.write(97);
            for(char c : "hello world!".toCharArray()){
             //   os.write((int)c);
                os.write(c);
            }

            os.write("hello world!".getBytes());
            os.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }
}
