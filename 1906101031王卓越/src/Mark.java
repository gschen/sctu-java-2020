class Mark {
    int math_scroe;
    int chinese_scroe;
    int english_scroe;

    Mark(int math_scroe, int chinese_scroe, int english_scroe){
        this.math_scroe = math_scroe;
        this.chinese_scroe = chinese_scroe;
        this.english_scroe = english_scroe;
        System.out.println("好好学习！天天向上！");
    }

    public void sums(){
        System.out.println("总成绩：" + (this.math_scroe+this.chinese_scroe+this.english_scroe));
    }

    public void average(){
        System.out.println("平均成绩：" + (this.math_scroe+this.chinese_scroe+this.english_scroe)/3);
    }
    public static int add(int b){
        int s = b * 2;
        return s;
    }


}
