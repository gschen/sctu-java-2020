package edu.sctu.java.day0929;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Test {

    static void loop(){
        loop();
    }

    public static void main(String[] args) {
        loop();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            try {

                System.out.println("Please input string: ");
                String input = scanner.next();

                if (input.equals("halt")) {
                    halt();
                }
                System.out.println("Input value is: " + input);

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    static void halt() {
        System.out.println(10 / 0);
    }
}
