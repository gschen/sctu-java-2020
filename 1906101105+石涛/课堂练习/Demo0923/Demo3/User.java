package Demo0923.Demo3;

public class User implements UserDao{
    @Override
    public String FindById(int id ,int[] index,String[] data) {
        for (int i = 0; i < index.length; i++) {
            if (id == index[i]) {
                return data[i];
            }
        }
        return null;
    }

    @Override
    public int FindByName(String name, int[] index, String[] data) {
        int i = 0;
        while (data[i]!=null && data[i]!=name){
            i++;
        }
        return index[i];
    }
}
