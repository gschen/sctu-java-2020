package 实验二.Test15;

public class Graduate implements StudentInterface,TeacherInterface{
    // 属性
    String name;
    String sex;
    int age;
    double fee;
    double pay;

    @Override
    public void setFee(double f) {
        fee = f;
    }

    @Override
    public double getFee() {
        return fee;
    }

    @Override
    public void setPay(double p) {
        pay = p;
    }

    @Override
    public double getPay() {
        return pay;
    }
}
