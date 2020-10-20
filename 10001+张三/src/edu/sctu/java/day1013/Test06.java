package edu.sctu.java.day1013;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Test06 {

    public static void main(String[] args) {


        // 字节流读
        try {
            InputStream is =
                    new FileInputStream("output.txt");

            int c = is.read();

            System.out.println((char) c);

            is.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
