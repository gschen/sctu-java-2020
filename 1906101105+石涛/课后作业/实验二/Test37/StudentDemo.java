package 实验二.Test37;

public class StudentDemo {
    public static void main(String[] args) {
        Student zhaoLiu = new Undergraduate("赵六","本科生",new int[]{80,82,87});
        Student chenQi = new Graduate("陈七","研究生",new int[]{80,82,84});

        // 判断是否通过
        zhaoLiu.judgePass();
        chenQi.judgePass();
        System.out.println("姓名\t\t类型\t\t是否通过");
        System.out.println(zhaoLiu.name+"\t\t"+zhaoLiu.category+"\t"+zhaoLiu.pass);
        System.out.println(chenQi.name+"\t\t"+chenQi.category+"\t"+chenQi.pass);
    }
}
