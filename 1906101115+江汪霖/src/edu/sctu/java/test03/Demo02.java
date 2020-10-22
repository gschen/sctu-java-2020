package edu.sctu.java.test03;

import java.io.*;

public class Demo02 {

    public static void main(String[] args) {

        String a = "E:\\output01.txt";

        //1.字节流写文件
        try {
            OutputStream os = new FileOutputStream(a);
            InputStream is = new FileInputStream(a);

            os.write("Beijing,欢迎你！".getBytes());

            byte[] bytes = new byte[20];
            int c;                     //一个一个的读
            while ((c = is.read(bytes)) != -1){
                System.out.print(new String(bytes,0,c));            //强制类型转换

            }
            os.write("我的学号是：1906101115".getBytes());
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
