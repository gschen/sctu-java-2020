package edu.sctu.java.day1013;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Test05 {
    public static void main(String[] args) throws IOException {
        //2.字符流
        try {
            Writer writer = new FileWriter("out.txt");
            writer.write("hello world!");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
