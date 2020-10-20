package edu.sctu.java.Day1013;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileSave {
    public static void main(String[] args) {
        //1.字节流  写文件
        try {
            OutputStream os = new FileOutputStream("test.txt");
            os.write(97);
            os.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
