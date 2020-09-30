package edu.sctu.java.day0922;

public class Client1 {

    public static void main(String[] args) {

       Teacher t = new Teacher();
        t.teach();

        t = new EnTeacher();
        t.teach();

        t = new CnTeacher();
        t.teach();

        //(new CnTeacher()).teach();


    }
}
