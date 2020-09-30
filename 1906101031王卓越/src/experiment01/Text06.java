package experiment01;

public class Text06 {
    int grade;
    public void grade(int grade){
        if (grade>=85){
            System.out.println("A");
        }else if (grade>=70 & grade<85){
            System.out.println("B");
        }else if (grade>=60 & grade<70){
            System.out.println("C");
        }else {
            System.out.println("D");
        }
    }

    public static void main(String[] args) {
        Text06 s = new Text06();
        s.grade = 86;
        s.grade(s.grade);
    }
}
