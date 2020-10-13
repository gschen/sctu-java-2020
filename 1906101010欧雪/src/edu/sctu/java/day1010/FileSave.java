package edu.sctu.java.day1010;

import java.io.*;

public class FileSave {
    public static void main(String[] args) throws IOException {
//        1，字节流，写文件
        OutputStream os=new FileOutputStream("G:\\output.txt");  //ctrl+P
////        os.write(97);
//        for(char c:"hello,world!".toCharArray()){
//////            os.write((int)c);
////            os.write(c);
////        }
//        os.write("helloWorld!".getBytes());
        os.write("Hello,world!".getBytes(),5,3);
        os.close();
//        2，
    }
}
