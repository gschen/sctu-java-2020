package day0929;
import java.util.*;
public class MapTest {
    public static <integer> void main(String[] args) {
        List<String>list=new ArrayList<String>();

        list.add("dog");
        list.add("dog");
        list.add("bird");
        list.add("bird");
        list.add("bird");
        list.add("cat");
        list.add("cat");
        list.add("cat");


        Map<String, Integer> m1=new HashMap<>();
        for (String i :list){
            if (m1.containsKey(i)){
                m1.put(i,m1.get(i)+1);
            }
            else{
                m1.put(i,1);
            }
        }
        System.out.println(m1);
    }
}
