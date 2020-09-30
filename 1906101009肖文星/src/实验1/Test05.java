package 实验1;

public class Test05 {
    public static void main(String[] args) {
        int[] test=new int[]{1,2,3,4,5};
        for(int i:test){
            if(i==1){
                System.out.println("不及格");
            }else if (i==2){
                System.out.println("及格");
            }else if (i==3){
                System.out.println("中等");
            }else if (i==4){
                System.out.println("良好");
            }else{
                System.out.println("优秀");
            }

        }
        for(int j:test){
            switch (j){
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
                default:
                    System.out.println("default");
            }
        }
    }
}
