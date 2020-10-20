package edu.sctu.java.day1013;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Test04 {

    public static void main(String[] args) {

        //1.字节流写文件
        try {                                        //ctrl+p   方法参数提示
            OutputStream os = new FileOutputStream("E:\\output.txt");    // windows需要用\\

            os.write("Hello,World!".getBytes());
            os.write("Hello,World!".getBytes(),0,3);                //off偏移，len长度

//            for (char c :"Hello,world!".toCharArray()){
//                os.write(c);
//            }


            os.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
