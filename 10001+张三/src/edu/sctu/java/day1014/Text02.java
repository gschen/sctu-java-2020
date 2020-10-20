package edu.sctu.java.day1014;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Text02 {
    public static void main(String[] args) {
        try {
            Writer writer=new FileWriter("output.txt");
            writer.write("hello,world");
            writer.close();

//            Writer w = new Writer();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
