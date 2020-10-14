package edu.sctu.java.test;

import java.io.*;

public class JavaIOTest {
    static void in() throws IOException{
        InputStream is = new FileInputStream("data/t1.txt");

        byte[] buffer = new byte[1024];
        StringBuilder stringBuilder = new StringBuilder();


        while((is.read(buffer)) != -1){
            stringBuilder.append(new String(buffer));
        }

        System.out.println(stringBuilder.toString());

        is.close();
    }

    static void readData() throws IOException {

        DataInputStream is = new DataInputStream(
                new FileInputStream("data/data.bin")
        );

        int a = is.readInt();
        long b = is.readLong();

        System.out.println(a);
        System.out.println(b);


    }

    static void writeData() throws IOException {

        DataOutputStream os = new DataOutputStream(
                new FileOutputStream("data/data.bin")
        );

        os.writeInt(32);
        os.writeLong(1024L);
        os.close();
    }

    static void bufIn() throws IOException {
        BufferedInputStream is = new BufferedInputStream(
                new BufferedInputStream(
                        new FileInputStream("data/t1.txt")
                )
        );

        byte[] buffer = new byte[1024];
        is.read(buffer);

        is.close();
    }

    static void pipedIn() throws IOException {

        PipedInputStream is = new PipedInputStream();
    }

    static void seqIn() throws IOException {

        SequenceInputStream sis = new SequenceInputStream(
                new FileInputStream("data/t1.txt"),
                new FileInputStream("data/t2.txt")
        );

        int b;

        while ((b = sis.read()) != -1) {

            System.out.print((char) b);
        }

        sis.close();

    }

    public static void main(String[] args) {

        try {
//            writeData();
//            readData();
//            seqIn();
            in();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
