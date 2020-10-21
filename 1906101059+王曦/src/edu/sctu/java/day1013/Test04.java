package edu.sctu.java.day1013;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class Test04 {


    public static void main(String[] args) {

            try {
                OutputStream os = new FileOutputStream("D:\\outout.txt");



                os.write("hello world".getBytes());

                for (char c : "hello world".toCharArray()){

                    try {


                        os.write(c);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }





}
