package edu.sctu.java.实验三;

import java.io.File;

public class Test02 {
    public static void main(String[] args) {
        File file = new File("D:\\");
        file.mkdir();
        File[]f1=file.listFiles();
        for (int i = 0; i <f1.length ; i++) {
            if(f1[i].isDirectory()){
                System.out.println("dict"+f1[i].getName());

            }else {
                System.out.println("file"+f1[i].getName());
            }
        }
    }
}
