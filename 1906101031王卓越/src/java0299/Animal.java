package java0299;


public class Animal {
    public void leg(){
        String sh = "abcd";
        StringBuilder s = new StringBuilder(sh).reverse();
        System.out.println(s);
    }

    public static void main(String[] args) {
        Animal s = new Animal();
        s.leg();
    }
}
