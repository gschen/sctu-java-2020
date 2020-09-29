package Demo0929.Demo2;

import java.util.HashMap;
import java.util.Map;

public class LastTest {
    public static void main(String[] args) {
        Map<String,Integer> animalMap = new HashMap<String, Integer>(); // 定义一个map
        String[] animals = {"dog","dog","bird","cat","fish","cat","cat","fish"}; // 定义一个动物的数组

        // 查找数组内的动物的个数，储存在map内
        for (String animal : animals) {
            if (animalMap.containsKey(animal)) {
                animalMap.put(animal, animalMap.get(animal) + 1);
            } else {
                animalMap.put(animal, 1);
            }
        }

        // 打印map
        System.out.println(animalMap);
    }
}
