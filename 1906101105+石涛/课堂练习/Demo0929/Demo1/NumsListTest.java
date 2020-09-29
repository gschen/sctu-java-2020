package Demo0929.Demo1;

public class NumsListTest {
    public static void main(String[] args) {
        // 定义列表
        Character[] characters=new Character[3];

        // 实例化对象
        for (int i = 0; i < 3; i++) {
            characters[i] = new Character();
        }

        // 设置属性，使用方法
        characters[0].name="Jack";
        characters[1].name="Tom";
        characters[2].name="Marry";
        for (int i = 0; i < 3; i++) {
            characters[i].move();
        }
    }
}
