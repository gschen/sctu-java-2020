package edu.sctu.java.day1021;

public interface StudentDBManager {
    //CRUD
    //输入信息然后保存
    String  saveStudent(String name,int id,int age,String gender,int sno);
    //通过id查找
    String query(int id);

    void update(String sql);
    //直接通过id删除整列
    void delete(int id);

}
