package edu.sctu.java.day1013;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Test04 {
    public static void main(String[] args) {

        //1字节流 写文件
        try {
            OutputStream os = new FileOutputStream("output.txt");
            os.write(97);

            os.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
