package edu.sctu.java.实验二.Test16;

public class Client {
    public static void main(String[] args) {
        Plus pl = new Plus();
        Multi multi = new Multi();
        Reduce reduce = new Reduce();
        Except except = new Except();

        pl.op(10,20);
        multi.op(10,20);
        reduce.op(10,20);
        except.op(10,20);
    }
}
