package com.qiaolu;

import org.junit.jupiter.api.Test;

import java.sql.*;

public class JdbcDemo {
    @Test
    void updateUser() {
        // 数据库连接信息
        String url = "jdbc:mysql://localhost:3306/db_homework";
        String user = "root";
        String password = "1234";

        // SQL更新语句
        String sql = "UPDATE user SET password = ?, name = ?, age = ? WHERE id = ?";

        // 连接数据库并执行更新.try中自动释放资源
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // 设置更新参数
            pstmt.setString(1, "666888");
            pstmt.setString(2, "关羽");
            pstmt.setInt(3, 32);
            pstmt.setInt(4, 4);

            // 执行更新
            int rowsAffected = pstmt.executeUpdate();
            System.out.println("Rows affected: " + rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    void TestSelectUser() {
        String url = "jdbc:mysql://localhost:3306/db_homework";
        String user = "root";
        String password = "1234";

        // SQL更新语句
        String sql = "select id,username,password,name,age from user where age >= ? and id <= ?";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            // 设置更新参数
            preparedStatement.setInt(1, 20);
            preparedStatement.setInt(2, 4);

            // 执行更新
            ResultSet rowsAffected = preparedStatement.executeQuery();
            while(rowsAffected.next()) {
                int id = rowsAffected.getInt("id");
                String username = rowsAffected.getString("username");
                String pw = rowsAffected.getString("password");
                String name = rowsAffected.getString("name");
                int age = rowsAffected.getInt("age");
                System.out.println("ID: " + id + ", Username: " + username + ", Password: " + pw + ", Name: " + name + ", Age: " + age);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
