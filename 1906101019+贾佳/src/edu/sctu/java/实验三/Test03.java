package edu.sctu.java.实验三;

import java.io.*;

public class Test03 {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("test.txt",true);
            for (char c : "BeiJing welcome".toCharArray()){
                os.write(c);
           }
            InputStream in = new FileInputStream("test.txt");
            int c = 0;
            while ((c = in.read())!=-1){
                System.out.println((char)c);
            }
            for(char k : "my sno:1906101019".toCharArray()){
                os.write(k);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
