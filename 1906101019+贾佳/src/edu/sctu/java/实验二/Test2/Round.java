package edu.sctu.java.实验二.Test2;

import java.util.Scanner;

public class Round {

    double Square(double len){
        return Math.PI * Math.pow(len,2);
    }
    double Leng(double len){
        return 2*(Math.PI * (2*len));
    }

    public static void main(String[] args) {
        Round round = new Round();
        Scanner input = new Scanner(System.in);
        double len = input.nextDouble();
        System.out.println(round.Square(len));
        System.out.println(round.Leng(len));
    }
}
