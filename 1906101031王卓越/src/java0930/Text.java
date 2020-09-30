package java0930;

public class Text {
    public void print(int p){
        if(p == 4){
            return;
        }
        System.out.println("哈哈");
        print(p+1);
    }

    public static void main(String[] args) {
        Text t = new Text();
        t.print(0);
    }
}
