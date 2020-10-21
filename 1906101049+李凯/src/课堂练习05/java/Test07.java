package 课堂练习05.java;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.channels.ScatteringByteChannel;

public class Test07 {
    public static void main(String[] args) {
        //字符流
        try {
            Reader reader = new FileReader("out.txt");
            int c;
            while ((c = reader.read()) != 1){
                System.out.println((char)c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
/**
 * Reader reader = new FileReader
 *
 *
 *
 *
 */



