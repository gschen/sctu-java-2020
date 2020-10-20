package edu.sctu.java.day1014;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Test04 {

    public static void main(String[] args) {

        try {
            Reader reader = new FileReader("output.txt");

            int c;

            while ((c = reader.read()) != -1) {

                System.out.print((char)c);

            }


            char[] buffer = new char[1024];
            reader.read(buffer);

            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
