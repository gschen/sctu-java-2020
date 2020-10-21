package edu.sctu.java.day1021;

import java.sql.*;

public class Test02 {

    public static void main(String[] args) {

//        String sql = "insert into t_users(name,age,gender,sno) values('jiang',20,'男','115')";
        String sql = "insert into t_users(name,age,gender,sno) values(?,?,?,?)";

        Connection connection = null;
//        Statement statement = null;
        PreparedStatement preparedStatement = null;    //代替 statement
        ResultSet resultSet = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java?serverTimezone=UTC",
                    "root",
                    "200007"
            );
//            statement = connection.createStatement();
//            statement.execute(sql);
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,"sctu");
            preparedStatement.setInt(2,19);
            preparedStatement.setString(3,"男");
            preparedStatement.setInt(4,115);
            preparedStatement.execute();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {

            try {
//                statement.close();
                connection.close();
                preparedStatement.close();

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
