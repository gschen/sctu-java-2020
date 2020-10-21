package dately.work.scool.experiment2.dayNationalDay.day1011;

import java.util.*;

public class T33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 输入
        System.out.println("输入单词，以空格隔开：");
//        nextLine:返回的是一个长度为0的空字符串
        String input = sc.nextLine().toString(); // 转换为字符串
        String[] list = input.split(" "); // 以空格分割字符串

        // 放入集合中
        List<String> words = new ArrayList<String>(Arrays.asList(list));

        // 排序
        Collections.sort(words);

        // 打印
        for (String i : words){
            System.out.println(i);
        }

    }
}

