package edu.sctu.java.test;

import java.io.*;

public class JavaIO {

    static void write() {

        byte[] buffer = new byte[1024];

        try {
            OutputStream os = new FileOutputStream("output.txt");
            int count = System.in.read(buffer);

            os.write(buffer, 0, count);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    static void read() {
        try {
            InputStream is = new FileInputStream("output.txt");

            int b = 0;
            while ((b = is.read()) != -1) {

                System.out.print((char) b);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }

    public static void main(String[] args) {

//        write();
//        read();

        System.out.println((int)'a');
    }
}
