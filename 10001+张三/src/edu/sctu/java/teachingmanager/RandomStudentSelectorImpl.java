package edu.sctu.java.teachingmanager;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomStudentSelectorImpl implements RandomStudentSelector {
    List<String> nameList = new ArrayList<String>();

    void init(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("data/1903.txt"));
            String line = "";

            while ((line = reader.readLine()) != null) {
                nameList.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String randomSelectStudent() {

        Random random = new Random();
        int randomIndex = random.nextInt(38);
        return nameList.get(randomIndex);
    }

    @Override
    public void run() {

        init();

        System.out.println("$ Please input(s for start, q for quit):");
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String cmd = scanner.next();

            switch (cmd) {
                case "s":
                    String name = randomSelectStudent();
                    System.out.println("Selected Name is: " + name);
                    break;

                case "q":
                    System.exit(0);
                    break;

                default:

            }


        }
    }
}
