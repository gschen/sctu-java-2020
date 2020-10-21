package edu.sctu.java.day1020;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Test01 {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("out.txt");
            int c;
            while((c=is.read())!=-1){
                System.out.println(c);
            }

            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
