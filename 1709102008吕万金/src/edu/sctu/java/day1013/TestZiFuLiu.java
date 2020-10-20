package edu.sctu.java.day1013;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class TestZiFuLiu {
    public static void main(String[] args) {
        //字符流
        try {
            Writer writer=new FileWriter("D:\\out.txt");
            writer.write("hello,world!\n");
            writer.write("hello,world!\n");
            writer.write("hello,world!\n");
            writer.write("hello,world!\n");

            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
