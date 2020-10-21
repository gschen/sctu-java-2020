package edu.sctu.java.day1013;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Test05 {


    public static void main(String[] args) {


        try {
            Writer writer = new FileWriter("output.text");



            writer.write("hello world");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
