package edu.sctu.java.day1020;

import java.sql.*;

public class Test03 {

    public static void main(String[] args) {


        // 3 + 1
        String sql = "insert into t_users(name) values ('alice')";


        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // 加载mysql驱动程序
            Class.forName("com.mysql.jdbc.Driver");

            // sctu.edu.cn
            // cn/edu/sctu/day1020

            connection = DriverManager.getConnection(
                    //http://www.sctu.edu.cn:8080/index.html
                    "jdbc:mysql://localhost:3306/java?serverTimezone=UTC", // 数据库连接字符串
                    "root",
                    "123456" //你的数据库密码
            );

            statement = connection.createStatement();

            statement.execute(sql);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
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
