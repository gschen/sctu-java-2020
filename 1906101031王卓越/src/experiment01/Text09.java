package experiment01;

import java.util.ArrayList;

public class Text09 {
    public void table(){
        ArrayList l = new ArrayList();
        for (int i = 97; i < 117 ; i++) {
            char p = (char)i;
            char k = Character.toUpperCase(p);
            l.add(k);
        }
        System.out.print(l.get(1));
        prints(l);
    }

    public void prints(ArrayList l){

    }

    public static void main(String[] args) {
        Text09 s = new Text09();
        s.table();
    }
}
