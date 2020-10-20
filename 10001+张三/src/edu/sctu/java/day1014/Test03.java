package edu.sctu.java.day1014;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Test03 {

    public static void main(String[] args) {
        // 字节流读文件

        try { // shift+enter
            InputStream is = new FileInputStream(
                    "output.txt");

            int b;

            while((b = is.read()) != -1){

                System.out.print((char)b);
            }

            is.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
