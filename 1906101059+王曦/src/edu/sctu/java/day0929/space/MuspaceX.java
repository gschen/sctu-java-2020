package edu.sctu.java.day0929.space;

import java.util.Scanner;

public class MuspaceX implements Spaceaction {
    @Override
    public void start() {

    }

    @Override
    public void shutdown() {

    }

    @Override
    public void run() {

        while (true){
            Scanner scanner = new Scanner(System.in);

            char cmd = scanner.next().charAt(0);

            switch (cmd){
                case 'u':
                    up();
                    break;
                case 'd':
                    down();
                    break;
                case 'l':
                    left();
                    break;
                case 'r':
                    right();
                    break;
                case 'q':
                    System.exit(0);
            }
        }

    }

    @Override
    public void up() {

    }

    @Override
    public void down() {

    }

    @Override
    public void left() {

    }

    @Override
    public void right() {

    }
}
