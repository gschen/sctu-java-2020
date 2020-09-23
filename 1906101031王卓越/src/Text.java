public class Text {
    //main函数
    public static void main(String[] args) {
        Mark p = new Mark(80,90,60);
        p.math_scroe = 80;
        p.chinese_scroe = 90;
        p.english_scroe = 60;
        p.sums();
        p.average();
        int sums = 0;
        for (int i = 0; i < 30; i++){
            sums += p.add(i);
        }

        System.out.println(sums);
    }


}
