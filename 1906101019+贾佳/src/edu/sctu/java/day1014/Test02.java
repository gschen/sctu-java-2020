package edu.sctu.java.day1014;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test02 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("out.txt"));
            List<String> lis = new ArrayList<String>();
            String line;
            while((line = reader.readLine()) != null){
                lis.add(line);

            }
            System.out.println(lis);
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
