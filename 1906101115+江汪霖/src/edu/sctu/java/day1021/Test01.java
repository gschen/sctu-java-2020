package edu.sctu.java.day1021;

import java.sql.*;

public class Test01 {

    public static void main(String[] args) {

        String sql = "select * from t_users";

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            Class.forName("");
            try {
                connection = DriverManager.getConnection("");

                statement = connection.createStatement();

                resultSet = statement.executeQuery(sql);

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
