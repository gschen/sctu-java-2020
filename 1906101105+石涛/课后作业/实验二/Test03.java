package 实验二;

// 设计一个表示学生的类，里面有学生的三项成绩：计算机成绩、数学成绩、英语成绩。
// 要求可以求总分、平均分、最高分、最低分，并且可以输出一个学生的完整信息。
public class Test03 {
    String name;
    int age;
    int id;

    String studentScore(int computerScore,int mathScore,int englishScore){
        // 成绩属性
        double totalScore;
        double averageScore;
        double maxScore;
        double minScore;

        totalScore = computerScore+mathScore+englishScore; // 总分
        averageScore = totalScore/3; // 平均分
        maxScore = Math.max(Math.max(computerScore,mathScore),englishScore); // 最高分
        minScore = Math.min(Math.min(computerScore,mathScore),englishScore); // 最低分

        return String.format("总分：%.2f\n平均分：%.2f\n最高分：%.2f\n最低分：%.2f",
                totalScore,averageScore,maxScore,minScore);
    }

    public static void main(String[] args) {
        Test03 test03 = new Test03();

        test03.name="小明";
        test03.age=18;
        test03.id=12138;
        System.out.println("姓名："+test03.name+"\n学号："+test03.id+"\n年龄:"+test03.age+"\n"
                +test03.studentScore(87,93,97));
    }
}
