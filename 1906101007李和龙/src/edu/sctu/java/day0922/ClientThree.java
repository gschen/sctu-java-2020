package edu.sctu.java.day0922;

public class ClientThree {
    public static void main(String[] args) {
        Study a = new Study();
        a.study();

        a = new Chinese();
        a.study();

        a = new Math();
        a.study();

        Math c = new Math();
        Study b= c;
        b.study();
//
//        Study study = new Study();
//        Math math = (Math)study;
//        math.study();

        Math math = (Math) new Study();
        math.study();
        Chinese Chinese = (Chinese) new Study();
        math.study();
    }
}
