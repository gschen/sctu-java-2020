package dately.work.scool.experiment3;

import java.io.*;

public class T3 {
    public static void main(String[] args) {
        try {
            OutputStream os=new FileOutputStream("D:\\text.txt");

            os.write("Beijing欢迎你！".getBytes());
            os.close();

            Writer writer=new FileWriter("D:\\text.txt",true);
            writer.write("我的学号是：1709102008");
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
