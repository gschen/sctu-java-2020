package edu.sctu.java.day1014;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class KaiFaTest {
    public static void main(String[] args) {
        BufferedReader reader;
        try {
             reader = new BufferedReader(
                            new FileReader("D:\\output.txt"));

            String line;
            while ((line=reader.readLine())!=null){
                System.out.println(line);

            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
