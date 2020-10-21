package edu.sctu.java.day1013;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Test07 {

    public static void main(String[] args) {

        //字符流读
        try {

            Reader reader = new FileReader("out.txt");

            int a;

            while ((a = reader.read()) != -1){

                System.out.print((char)a);

            }
//            char[] buffer = new char[1024];
//            reader.read(buffer);

            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
