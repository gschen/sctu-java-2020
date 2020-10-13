package 实验二;

import java.util.*;

public class Test33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 输入
        System.out.println("输入单词，以空格隔开：");
        String input = in.nextLine().toString(); // 转换为字符串
        String[] list = input.split(" "); // 分割字符串

        // 放入集合中
        List<String> words = new ArrayList<String>();
        for (int i = 0; i < list.length; i++) {
            words.add(list[i]);
        }

        // 排序
        Collections.sort(words);

        // 打印
        for (String i : words){
            System.out.println(i);
        }
    }
}
