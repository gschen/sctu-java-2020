package edu.sctu.java.test;


import java.sql.*;

public class Test04 {

    public static void main(String[] args) {

        String sql = "insert into t_users(name) values (?)";

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");


            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java?serverTimezone=UTC",
                    "root",
                    "123456"
            );

            statement = connection.prepareStatement(sql);
            statement.setString(1, "good!!!");
            statement.execute();

            String sql1 = "select * from t_users";
            statement = connection.prepareStatement(sql1);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {

                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);

                System.out.println(id + name);
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {

            try {
                resultSet.close();
                statement.close();
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
