package edu.sctu.java.第一次实验;

//public class E {
//    public static void main(String[] args) {
//        int score = (int)(1+5*Math.random());
//        if (score < 5){
//            if (score < 4){
//                if (score < 3){
//                    if (score < 2){
//                        System.out.println("不及格");
//                    }
//                    else{
//                        System.out.println("及格");
//                    }
//                }
//                else{
//                    System.out.println("中等");
//                }
//            }
//            else{
//                System.out.println("良好");
//            }
//        }
//        else{
//            System.out.println("优秀");
//        }
//    }
//}


public class E{
    public static void main(String[] args) {
        int score = (int)(1+5*Math.random());
        switch (score){
            case 1:
                System.out.println("不及格");
                break;
            case 2:
                System.out.println("及格");
                break;
            case 3:
                System.out.println("中等");
                break;
            case 4:
                System.out.println("良好");
                break;
            case 5:
                System.out.println("优秀");
                break;
        }
    }
}