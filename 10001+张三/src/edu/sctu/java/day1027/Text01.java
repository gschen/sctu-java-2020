package edu.sctu.java.day1027;

import java.sql.*;

public class Text01 {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        String sql = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");

            try {
                connection = DriverManager.getConnection(
                        "",
                        "",
                        ""
                );

                statement = connection.createStatement();
                resultSet = statement.executeQuery(sql);

                while (resultSet.next()){
                    int id;
                    String name;

                    id = resultSet.getInt(1);
                    name = resultSet.getString(2);

                    System.out.println(id+" "+name);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }


        } catch (ClassNotFoundException e) {
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
