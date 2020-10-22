package edu.sctu.java.test03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Demo01 {

    public static void main(String[] args) {

        System.out.println("输入路径：");          //输入路径

        Scanner s = new Scanner(System.in);
        String a = s.next();
        //  按行读
        try {
            BufferedReader reader = new BufferedReader(new FileReader(a));

            String line;
            while ((line = reader.readLine()) !=null){    //读取文件数据

                System.out.println(line);                 // 打印内容
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
