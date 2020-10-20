package edu.sctu.java.homework.Experiment1;

import java.io.IOException;

public class Test6 {
    public static void main(String[] args) throws IOException {
        char a;
        a =(char)System.in.read();
        String s = String.valueOf(a);
        switch (s){
            case "A" :
                System.out.println("85分以上（包括85）");
                break;
            case "B" :
                System.out.println("70分以上（包括70分）");
                break;
            case "C" :
                System.out.println("60分以上（包括60分）");
                break;
            case "D" :
                System.out.println("60分以下");
                break;
        }

    }
}


// 65 97