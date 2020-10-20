package 课堂练习05.java;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Test04 {
    public static void main(String[] args) throws IOException {

        //字节流，写文件
        try {
            OutputStream os = new FileOutputStream("D:\\IDE");     // 快捷键  ctrl+p
            os.write(97);
            for (char c : "hello,world".toCharArray()) {
                os.write((int) c);
            }
            os.write("helloworld!".getBytes());
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

