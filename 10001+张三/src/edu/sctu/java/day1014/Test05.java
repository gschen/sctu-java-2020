package edu.sctu.java.day1014;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test05 {

    public static void main(String[] args) {

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(
                    new FileReader("output.txt"));

            String line;

            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }

            reader.close();





        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
