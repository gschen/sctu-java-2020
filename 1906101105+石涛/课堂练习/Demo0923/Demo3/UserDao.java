package Demo0923.Demo3;

public interface UserDao {

    public String FindById(int id,int[] index,String[] data);

    public int FindByName(String name, int[] index, String[] data);
}
