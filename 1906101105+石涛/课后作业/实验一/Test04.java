package 实验一;

// 用 for 语句、while 语句以及 do while 语句编写一个求和程序（即 sum=1+2+3+...+n）
public class Test04 {
    // for 求和
    int forSum(int n){
        int ans=0;
        for (int i=1; i<=n; i++){
            ans+=i;
        }
        return ans;
    }

    // while 求和
    int whileSum(int n){
        int ans=0;
        int i=1;
        while(i<=n){
            ans+=i;
            i+=1;
        }
        return ans;
    }

    // do...while 求和
    int doWhileSum(int n){
        int ans=0;
        int i=1;
        do{
            ans+=i;
            i+=1;
        }while (i<=n);
        return ans;
    }

    public static void main(String[] args) {
        int n=100;

        Test04 t = new Test04();
        System.out.println(t.forSum(n));
        System.out.println(t.whileSum(n));
        System.out.println(t.doWhileSum(n));
    }
}
