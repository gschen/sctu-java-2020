package edu.sctu.java.teachingmanager;

public class Client {
    public static void main(String[] args) {
        RandomStudentSelector teachingManager = new RandomStudentSelectorImpl();
        teachingManager.run();
    }
}
