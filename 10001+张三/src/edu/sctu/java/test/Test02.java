package edu.sctu.java.test;

import java.sql.*;

public class Test02 {

    public static void main(String[] args) throws SQLException {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        String sql = "SELECT * from t_users";

        String sql_insert = "INSERT INTO t_users(name) VALUES(?)";

        try {
            Class.forName("com.mysql.jdbc.Driver");

            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test?serverTimezone=UTC",
                    "root",
                    "123456"
            );

            preparedStatement = connection.prepareStatement(sql_insert);
            preparedStatement.setString(1, "gongsuo");
            preparedStatement.execute();

            statement = connection.createStatement();

            resultSet = statement.executeQuery(sql);

            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);

                System.out.println(id + name);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            resultSet.close();
            statement.close();
            connection.close();
        }
    }
}
