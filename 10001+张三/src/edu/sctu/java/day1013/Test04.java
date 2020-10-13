package edu.sctu.java.day1013;

import java.io.*;

public class Test04 {

    public static void main(String[] args) {

        // 1. 字节流 写文件
        try {
            OutputStream os = new FileOutputStream(
                    "output.txt"); // ctrl+P

            os.write(97);

            os.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
