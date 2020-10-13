package edu.sctu.java.day1013;

import java.io.*;

public class Test04 {

    public static void main(String[] args) {

        // 1. 字节流 写文件
        try {
            OutputStream os = new FileOutputStream(
                    "E:\\Download\\output.txt"); // ctrl+P

//            os.write(97);

//            for(char c : "hello, world!".toCharArray()){
////                os.write((int)c);
//                os.write(c);
//            }
//
//            os.write("helloworld!".getBytes());
            os.write("Hello,world!".getBytes(),
                    5,
                    3);

            os.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
