package day0923.Work.School;

public class Graduate implements StudentInterface,TeacherInterface {

    String name;
    String sex;
    int age;
    private double fee;
    private double pay;

    @Override
    public double getFee() {
        return this.fee;
    }

    @Override
    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public double getPay() {
        return this.pay;
    }

    @Override
    public void setPay(double pay) {
        this.pay = pay;
    }

    public void isEnough() {
        if (this.getPay() - this.getFee() < 2000) {
            System.out.println("You need a loan");
        } else {
            System.out.println("You income is enough");
        }
    }
}