package Demo1013.Demo5;

import java.io.*;

public class OutTest {
    public static void main(String[] args) {

        //字节流写入

        try {
            OutputStream os = new FileOutputStream("HelloWorld.txt");

            // 写入HelloWorld
            //os.write(new byte[]{(int)'H',(int)'e',(int)'l',(int)'l',(int)'o',(int)' ', (int)'W',(int)'o',(int)'r',(int)'l',(int)'d',(int)'!'});
            os.write("Hello World !\n".getBytes());
            os.write("Hello World !\n".getBytes());
            os.write("Hello World !\n".getBytes());
            os.write("Hello World !\n".getBytes());

            os.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        // 字符流写入文件

        try {
            Writer writer = new FileWriter("out.txt");

            // 写入字符
            writer.write("Hello World !\n");
            writer.write("Hello World !\n");
            writer.write("Hello World !\n");
            writer.write("Hello World !\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
