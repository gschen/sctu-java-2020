package day0923.Work;

public class Staff {
    String name;
    int number;
    int salary;
    double salaryIncrease;

    Staff(){}

    void getName(){
        System.out.println("姓名:"+name);
    }
    void getNumber(){
        System.out.println("号码:"+number);
    }
    void getSalary(){
        System.out.println("工资:"+salary);
    }
    double getSalaryAfter(){
        return salary*(1+salaryIncrease);
    }

    public static void main(String[] args) {
        Staff staff=new Staff();

        staff.name="张三";
        staff.number=10011;
        staff.salary=4000;
        staff.salaryIncrease=0.3;

        staff.getName();
        staff.getNumber();
        staff.getSalary();
        double salaryAfter=staff.getSalaryAfter();
        System.out.println("涨幅后工资："+salaryAfter);
    }
}
