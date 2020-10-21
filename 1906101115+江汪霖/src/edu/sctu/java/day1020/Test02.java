package edu.sctu.java.day1020;

import java.sql.*;

public class Test02 {

    public static void main(String[] args) {

        //3+1
        String sql = "select * from t_users";

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/java?serverTimezone=UTC",
                        "root",
                        "200007"
                );

                statement = connection.createStatement();

                resultSet = statement.executeQuery(sql);

                while (resultSet.next()){
                    int id;
                    String name;

                    id = resultSet.getInt(1);
                    name = resultSet.getString(2);

                    System.out.println(id + name);
                }

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

}
