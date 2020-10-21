package edu.sctu.java.day1013;

import java.io.*;

public class TestZiJieLiu {

    public static void main(String[] args) {
        //字节流 写文件
        try {
            OutputStream os=new FileOutputStream("D:\\output.txt");//ctrl+p ..alt+enter选第二个，异常处理机制
//            os.write(97);//alt+enter选第一个。
//            for (char c:"hello,world!".toCharArray()){
//
//                os.write(c);
//            }

            os.write("hello,world!".getBytes());
//            os.write("hello,world!".getBytes(),
//                    5,
//                    3);

            os.close();
            //运行了之后会在sctu根目录下一个txt文件。
        } catch (IOException e) {
            e.printStackTrace();
        }
//    读    InputStream op;


    }
}
