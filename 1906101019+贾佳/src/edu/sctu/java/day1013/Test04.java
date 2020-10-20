package edu.sctu.java.day1013;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Test04 {
    public static void main(String[] args) {
        //1.字节流
//        byte [] b = {72,101,108,108,111,87,111,114,108,100};
        try {
            OutputStream os = new FileOutputStream("D:\\output.txt",true);
//            os.write(97);
//            os.write(b,0,10);
//            for (char c : "hello,world!".toCharArray()){
//                os.write(c);
//            }

           os.write("Hello,World".getBytes());

            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
