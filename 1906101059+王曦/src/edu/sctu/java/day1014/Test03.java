package edu.sctu.java.day1014;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test03 {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<String>();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("output.txt"));

            String line;

            while ((line = bufferedReader.readLine()) != null){

                System.out.println(line);
                stringList.add(line);

            }

            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
