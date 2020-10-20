package edu.sctu.java.day1020;

import java.io.*;

public class Test02 {
    public static void main(String[] args) {

        try {
            Reader reader = new FileReader(
                    "output.txt");
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }

            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader(new File("output.txt"))
            );
            String line = "";

            while ((line = bufferedReader.readLine())!=null){

                System.out.println(line);
            }
            bufferedReader.readLine();

            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
