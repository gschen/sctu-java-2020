package sctu.java.day0922;

public class Client1 {
    public static void main(String[] args) {
        Plant a = new Plant();
        a.blossom();

        a = new Grass();
        a.blossom();

        a = new Flower();
        a.blossom();
    }
}
