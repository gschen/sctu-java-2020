package edu.sctu.java.day1021;

import java.sql.*;

public class Test01 {
    public static void main(String[] args) {
        String sql = "insert into t_users(name,age,gender,sno) values (?,?,?,?)";
//        String sql = "update t_users set name = 'kkk' where id =  7";

        Connection connection = null;
        Statement statement = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java?serverTimezone=UTC","root","123456");
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1,"John");
                preparedStatement.setString(3,"male");
                preparedStatement.setInt(2,18);
                preparedStatement.setInt(4,433);
                preparedStatement.execute();
//                statement = connection.createStatement();
//                statement.execute(sql);

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                preparedStatement.close();
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }
    }
}
