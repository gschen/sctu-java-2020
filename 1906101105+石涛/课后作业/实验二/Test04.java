package 实验二;

// 编写并测试一个代表员工的类。它的属性包括：员工姓名、员工号码、员工基本薪水、员工薪水增长额；
// 它的方法包括：构造方法、获取员工姓名、获取员工号码、获取员工基本薪水、计算薪水增长额及计算增长后的工资总额。
public class Test04 {
    // 基本属性
    String name;
    int id;
    int salary;
    int increase;

    // 构造方法
    public Test04(String name, int id, int salary, int increase) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.increase = increase;
    }

    // 获取信息的方法
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public int getSalary() {
        return salary;
    }

    // 计算薪水增长额
    public int returnSalary(){
        return increase;
    }

    // 总工资
    public int totalSalary(){
        return salary+increase;
    }

    public static void main(String[] args) {
        Test04 staff = new Test04("Jack",12138,5000,1000);

        System.out.println("姓名："+staff.getName());
        System.out.println("工号："+staff.getId());
        System.out.println("工资："+staff.getSalary());
        System.out.println("工资增量："+staff.returnSalary());
        System.out.println("总工资："+staff.totalSalary());
    }
}
