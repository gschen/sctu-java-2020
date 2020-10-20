package 课堂练习05.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test08 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            reader.readLine();
            String line;
            while((line = reader.readLine()) !=null){
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
