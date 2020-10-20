package edu.sctu.java.day1014;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Test01 {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("test.txt");

            os.write(97);

            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
