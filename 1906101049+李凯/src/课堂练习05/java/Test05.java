package 课堂练习05.java;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
//(try/catch)  快捷键   CTRL+atl+t
public class Test05 {
    public static void main(String[] args) throws IOException {
        //字节流
        try {
            Writer writer = new FileWriter("out.txt");        //CTRL +p
            writer.write("hello,world\n");
            writer.write("hello,world\n");
            writer.write("hello,world\n");
            writer.write("hello,world\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/**字节流
 * public static void main (String[] args)
 * Writer writer
 *
 */


