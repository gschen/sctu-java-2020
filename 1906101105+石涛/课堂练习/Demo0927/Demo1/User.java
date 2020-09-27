package Demo0927.Demo1;

public class User implements UserDao{
    @Override
    public void useApp() {
        System.out.println("He is using an app ...");
    }
}
