package edu.sctu.java.test;

import java.io.*;

public class StringReaderTest {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(
                new StringReader("Hello\nGood\n"));

        try {
            String line = reader.readLine();
            System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }


        reader = new BufferedReader(
                new InputStreamReader(new FileInputStream("")));

        byte[] buf = "Hello, world!".getBytes();
        InputStream is = new ByteArrayInputStream(buf);

        is.read();


        ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("")
        );



    }
}
