package edu.sctu.java.实验三;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String path = input.next();
        try {
            OutputStream outputStream = new FileOutputStream(path);
            outputStream.write("hello，world".getBytes());
            BufferedReader bf = new BufferedReader(new FileReader(path));
            String line;
            List<String> lis = new ArrayList<String>();
            while ((line=bf.readLine())!=null){
                lis.add(line);
            }
            System.out.println(lis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
