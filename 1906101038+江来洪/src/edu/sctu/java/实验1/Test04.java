package edu.sctu.java.实验1;
public class Test04 {
    int addFor(int n){
        int sum = 0;
        for (int i=1;i<=n;i++){
            sum += i;
        }
        return sum;
    }
    int addWhile(int n){
        int sum = 0;
        while (n>0){
            sum += n;
            n--;
        }
        return sum;
    }
    int addDoWhile(int n){
        int sum = 0;
        do{
            sum += n;
            n--;
        }
        while (n>0);
        return sum;
    }
    public static void main(String[] args) {
        Test04 test04 = new Test04();
        System.out.println(test04.addFor(100));
        System.out.println(test04.addWhile(100));
        System.out.println(test04.addDoWhile(100));
    }
}
