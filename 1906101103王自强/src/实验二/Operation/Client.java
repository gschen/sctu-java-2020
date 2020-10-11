package 实验二.Operation;

public class Client {
    public static void main(String[] args) {
        double s;

        Operation op=new Add();
        s=op.op(7,8);
        System.out.println(s);

        op=new Sub();
        s=op.op(8,7);
        System.out.println(s);

        op=new Mul();
        s=op.op(7,8);
        System.out.println(s);

        op=new Div();
        s=op.op(8,4);
        System.out.println(s);
    }
}
