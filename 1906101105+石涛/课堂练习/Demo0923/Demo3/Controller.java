package Demo0923.Demo3;

public class Controller {
    public static void main(String[] args) {
        User user = new User();

        int[] nums = {5,4,2,1,3};
        String[] data = {"Tom","Anny","Jack","Mary","Stone"};

        String a = user.FindById(1,nums,data);
        int b = user.FindByName("Mary",nums,data);
        System.out.println(a);
        System.out.println(b);
    }
}
