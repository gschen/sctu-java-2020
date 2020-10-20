package Demo1013.Demo1;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer,String> people = new HashMap<Integer, String>();

        people.put(1,"Jack");
        people.put(2,"Tom");
        people.put(3,"Marry");

        for (Map.Entry<Integer,String> entry : people.entrySet()){
            System.out.println("key:"+entry.getKey()+",value:"+entry.getValue());
        }

        System.out.println(people);
    }
}
