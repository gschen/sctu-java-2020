package dately.work.scool.experiment2.dayNationalDay.day1009;

public class T4 {
    String name;
    String no;
    int salary;
    int increase;

    T4(String name,String no,int salary,int add){
        /*构造方法接收所有输入的参数*/
        this.name=name;
        this.no=no;
        this.salary=salary;
        this.increase =add;
    }
    String getName(){
        return name;
    }
    void setName(String name){
        this.name=name;
    }
    String getNo(){
        return no;
    }
    void setNo(String no){
        this.no=no;
    }
    int getSalary(){
        return salary;
    }
    void setSalary(int salary){
        this.salary=salary;
    }
    int getIncrease(){
        return increase;
    }
    void setAdd(int increase){
        this.increase = increase;
    }
    int sum(){
        return salary+increase;
    }
    void print(){
        System.out.println("员工姓名："+this.name+"\n"
                +"员工号码："+this.no+"\n"
                +"员工基本薪水："+this.salary+"\n"
                +"薪水增长额："+this.increase+"\n"
                +"增长后的工资总额："+this.sum()+"\n");
    }

    public static void main(String[] args) {
        T4 test2=new T4("xigua","001",2500,680);
        test2.print();
    }
}
