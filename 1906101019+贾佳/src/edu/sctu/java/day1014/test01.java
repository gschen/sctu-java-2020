package edu.sctu.java.day1014;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class test01 {
    public static void main(String[] args) {
        //字符流读取
        try {
            Reader reader = new FileReader("out.txt");
//            int c = 0;
//            while ((c = reader.read()) != -1){
//                System.out.print(c);
//            }
            char[] buffer = new char[1024];
            System.out.println(reader.read(buffer));
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
