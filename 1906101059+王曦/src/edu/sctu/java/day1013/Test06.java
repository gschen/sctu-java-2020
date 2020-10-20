package edu.sctu.java.day1013;

import java.io.*;

public class Test06 {

    public static void main(String[] args) {


        try {
            InputStream is = new FileInputStream("output.text");


            int c = is.read();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
