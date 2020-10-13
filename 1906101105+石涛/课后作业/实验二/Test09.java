package 实验二;

// 一个Java程序片断，以定义一个表示学生的类Student。这个类的属性有“学号”、“班号”、“姓名”、“性别”、“年龄”，
// 方法有“获得学号”、“获得班号”、“获得性别”、“获得姓名”、“获得年龄”、“获得年龄”。为类Student增加一个方法
// public String toString( )，该方法把Student类的对象的所有属性信息组合成一个字符串以便输出显示。
public class Test09 {
    // 属性
    String studentId;
    String classesId;
    String name;
    String sex;
    int age;

    // 构造方法
    public Test09(String studentId, String classesId, String name, String sex, int age) {
        this.studentId = studentId;
        this.classesId = classesId;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    // get方法
    public String getStudentId() {
        return studentId;
    }
    public String getClassesId() {
        return classesId;
    }
    public String getName() {
        return name;
    }
    public String getSex() {
        return sex;
    }
    public int getAge() {
        return age;
    }

    // 打印学生信息
    public String toString(){
        return (String.format("姓名：%s\n性别：%s\n年龄：%s\n班号：%s\n学号：%s\n",
                name,sex,age,classesId,studentId));
    }

    public static void main(String[] args) {
        Test09 student = new Test09("12138","03","Jack","man",20);

        System.out.println(student.toString());
    }
}
