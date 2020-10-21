package edu.sctu.java.day1013;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Test06 {
    public static void main(String[] args) {
        //字节流读取
        try {
            InputStream is = new FileInputStream("out.txt");
            int c = 0;
//            System.out.println(c);
            while ((c = is.read()) != -1){
                System.out.print((char)c);
            }
            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
