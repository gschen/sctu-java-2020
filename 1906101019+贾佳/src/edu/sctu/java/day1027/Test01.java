package edu.sctu.java.day1027;

import java.sql.*;

public class Test01 {
    public static void main(String[] args) {
        String line= "Select * from t_users";

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java?serverTimezone=UTC","root","123456");
            statement = connection.createStatement();
            resultSet = statement.executeQuery(line);
            while (resultSet.next()){
                int id;
                String name;
                id = resultSet.getInt(1);
                name = resultSet.getString(2);
                System.out.println(id+"  "+name);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
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
