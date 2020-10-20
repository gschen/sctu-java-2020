package 课堂练习05.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Test06 {
    public static void main(String[] args) {

        //字节流读
        try {
            InputStream is = new FileInputStream("D:\\IDE");
            int b ;
            while((b = is.read()) != -1){
            System.out.print((char)b);
            }

            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
