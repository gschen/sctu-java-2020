package java0929;
import java.util.*;

public class Fly {
    public void fl(){
        Scanner s = new Scanner(System.in);
        Operation p = new Operation();
        String inp = s.nextLine();
        if(inp.equals("start")){
            p.start();
            p.run();
            while (true){
                String it = s.nextLine();
                switch (it){
                    case "u":
                        p.up();
                        continue;
                    case "d":
                        p.down();
                        continue;
                    case "l":
                        p.left();
                        continue;
                    case "r":
                        p.right();
                        continue;
                    case "e":
                        p.exit();
                        break;
                    }
                }
        }else {
            p.shutdown();
        }

    }
}
