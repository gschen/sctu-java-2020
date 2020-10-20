package dately.work.scool.experiment3;


import java.io.File;

public class T2 {
    public static void main(String[] args) {
        File file=new File("D:\\");
        file.mkdir();
        File[] f1=file.listFiles();
        for (File value : f1) {
            if (value.isDirectory()) {
                System.out.println("Dictory:" + value.getName());
            } else {
                System.out.println("File:" + value.getName());
            }
        }
    }
}
