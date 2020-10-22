package edu.sctu.java.day1020;

import java.sql.*;

public class Test01 {
    public static void main(String[] args) {

//        String sql = "insert into t_users(name) values ('john')";
//        String sql = "delete from t_users where name='bob'";
        String sql = "update t_users set name = 'kkk' where name ='ddd'";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        //加载MySQL驱动程序
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //url:数据库链接字符串
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java?serverTimezone=UTC","root","123456");

            statement = connection.createStatement();
            statement.execute(sql);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {

            try {
                statement.close();
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
