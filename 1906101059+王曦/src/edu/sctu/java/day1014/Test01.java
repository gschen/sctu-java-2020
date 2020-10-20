package edu.sctu.java.day1014;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Test01 {

    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("output.txt");

            int b;
            while ((b = inputStream.read())!= -1){

                System.out.print((char)b);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

