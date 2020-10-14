package Demo1013.Demo4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Test {
    public static void main(String[] args) {
        // 字节流方式写文件
        try {
            OutputStream os = new FileOutputStream("output.txt"); // ctrl + p 函数的参数选择

//            os.write(97);
//            os.write(new byte[] {97,98,99,100});
            os.write(new byte[] {97,98,99,100,101},2,3);

            os.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
