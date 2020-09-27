package Demo0927.Demo2;

public class Nums {
    public static void main(String[] args) {
        // 数组
        int[] nums;
        nums = new int[5];
        nums[0]=1;
        nums[3]=4;

        // 3个人的数组
        // 创建数组
        Person[] people = new Person[3];

        // 实例化对象
        Person a = new Person();
        Person b = new Person();
        Person c = new Person();

        // 对象信息
        a.age=10;
        a.name="A";
        b.age=10;
        b.name="B";
        c.age=10;
        c.name="C";

        // 放入数组
        people[0]=a;
        people[1]=b;
        people[2]=c;

        // 用例测试
        System.out.println(people[0].name);
        System.out.println(people[0].age);
        System.out.println(people[1].name);
        System.out.println(people[2].name);
    }
}
