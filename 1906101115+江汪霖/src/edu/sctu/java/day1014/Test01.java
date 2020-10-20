package edu.sctu.java.day1014;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test01 {

    public static void main(String[] args) {

        //按行读

        try {
            BufferedReader reader = new BufferedReader(new FileReader("out.txt"));

            List<String>lines = new ArrayList<>();    //创建一个List<String>  来储存读出来的数据

            String line;
            while ((line = reader.readLine()) !=null){

                System.out.println(line);
                lines.add(line);

            }
            System.out.println(lines);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
