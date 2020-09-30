package edu.sctu.java.homework.Experiment1;

public class Test2 {
    public static void main(String[] args) {
        int a = 100;
        while (a<300) {
            a++;
            if (a % 3 == 0) {
                continue;

            }
            System.out.println(a);
        }

    }
}
