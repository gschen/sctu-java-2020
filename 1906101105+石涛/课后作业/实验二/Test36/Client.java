package 实验二.Test36;

public class Client {
    public static void main(String[] args) {
        // 实例化对象
        Student zhangSan = new Undergraduate("张三","本科生",new int[]{90,95,100});
        Student liSi = new Undergraduate("李四","本科生",new int[]{80,85,90});
        Student wangWu = new Postgraduate("王五","研究生",new int[]{82,85,88});
        Student zhaoLiu = new Undergraduate("赵六","本科生",new int[]{75,82,87});
        Student chenQi = new Postgraduate("陈七","研究生",new int[]{80,82,84});

        // 储存起来
        Student[] students = new Student[]{zhangSan,liSi,wangWu,zhaoLiu,chenQi};

        // 打印信息
        System.out.println("姓名\t\t类型\t\t成绩");
        for (Student i : students) {
            i.judgeLevel();
            System.out.println(i.name+"\t\t"+i.category+"\t"+i.level);
        }
    }
}
