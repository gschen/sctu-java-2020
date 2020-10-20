package java.day0923;

public abstract class WordTemplate {
    String brand;
    String vendor;

    void write(){
        System.out.println("写");
    }

    abstract void formatText();
}
