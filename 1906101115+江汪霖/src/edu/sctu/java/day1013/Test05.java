package edu.sctu.java.day1013;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Test05 {

    public static void main(String[] args) {

        //字符流
        try {
            Writer writer = new FileWriter("out.txt");

            writer.write("Hello,World!\n");
            writer.write("Hello,World!\n");
            writer.write("Hello,World!\n");
            writer.write("Hello,World!\n");
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
