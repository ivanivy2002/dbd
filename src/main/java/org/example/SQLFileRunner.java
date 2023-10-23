package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLFileRunner {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/ivandb";
        String username = "root";
        String password = "110406";
        String sqlFilePath = "../resources/to/sql/file.sql"; // 替换为 SQL 文件路径

        try (Connection connection = DriverManager.getConnection(url, username, password);
             Statement statement = connection.createStatement();
             BufferedReader reader = new BufferedReader(new FileReader(sqlFilePath))) {

            StringBuilder sqlBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                sqlBuilder.append(line);
            }
            String sql = sqlBuilder.toString();

            statement.executeUpdate(sql);
            System.out.println("SQL statements executed successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}