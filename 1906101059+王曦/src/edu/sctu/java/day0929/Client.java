package edu.sctu.java.day0929;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SpacePlane spacePlane = new SpacePlane();

            spacePlane.start();
            spacePlane.operation();
            while (true) {

                String a = s.next();
                if (a == "u") {
                    spacePlane.up();
                    break;
                }
                else if (a == "d") {
                    spacePlane.down();
                }
                else if (a == "l") {
                    spacePlane.left();
                }
                else if (a == "r") {
                    spacePlane.right();
                }
                else if (a == "q"){
                    System.exit(0);
            }

        }
    }
}
