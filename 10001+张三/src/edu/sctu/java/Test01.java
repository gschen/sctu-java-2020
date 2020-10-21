package edu.sctu.java;
import java.sql.*;
public class Test01 {
    public static void main(String[] args) {
        String sql = "select * from t_users";

        Connection connection = null;
        ResultSet resultSet =null;
        Statement statement=null;

//        try {
//            class .forName
//        }

        try {
            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
