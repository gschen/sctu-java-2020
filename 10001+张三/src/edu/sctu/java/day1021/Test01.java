package edu.sctu.java.day1021;

import java.sql.*;

public class Test01 {

    public static void main(String[] args) {

        // 3+1
        String sql = "insert into t_users(name, age, gender, sno) values (?, ?, ?, ?)";

        Connection connection = null;
//        Statement statement = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");

            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java?serverTimezone=UTC",
                    "root",
                    "123456"
            );

//            statement = connection.createStatement();
//            statement.execute(sql);
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "sctu");
            preparedStatement.setInt(2, 19);
            preparedStatement.setString(3, "男");
            preparedStatement.setString(4, "1001");

            preparedStatement.execute();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            try {
//                statement.close();
                preparedStatement.close();
                connection.close();

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }


    }
}
