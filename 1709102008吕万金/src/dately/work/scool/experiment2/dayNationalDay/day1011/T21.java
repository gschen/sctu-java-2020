package dately.work.scool.experiment2.dayNationalDay.day1011;

public class T21 {
    void countString(String str,String s) {
        int count = 0;
        while(str.contains(s)){

            str = str.substring(str.indexOf(s)+1,str.length());
            count++;

        }
        System.out.println(s+"出现的次数为"+count+"次");
    }

    public static void main(String[] args) {
        T21 test=new T21();
        test.countString("javajfiewjavajfiowfjavagkljjava","java");
    }
}
