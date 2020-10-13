package edu.sctu.java.day1010;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileSaver {
    public static void main(String[] args) {
//        字符流
        try {


            Writer writer = new FileWriter("out.txt");
            writer.write("HelloWorld!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
