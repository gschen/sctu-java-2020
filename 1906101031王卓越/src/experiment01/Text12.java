package experiment01;

public class Text12 {
    public void method(){
        for (int i = 1; i <= 1000; i++) {
            String sh = String.valueOf(i);
            StringBuilder s = new StringBuilder(sh);
            String p = s.toString();
            int sums = 0;
            for (int j = 0; j < p.length(); j++) {
                char k = p.charAt(j);
                int q = Integer.parseInt(String.valueOf(k));
                int value = (int) Math.pow(q, 3);
                sums  += value;
                }
            if (sums == i){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Text12 t = new Text12();
        t.method();
    }
}
