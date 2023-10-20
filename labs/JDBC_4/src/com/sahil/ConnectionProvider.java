package com.sahil;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
    public static Connection createConnection() {
        Connection conn = null;
        try {
            // JDBC URL for MySQL
            String url = "jdbc:mysql://localhost:3306/students";
            String username = "root";
            String password = "Sahil!23";

            // Register the MySQL driver (optional for JDBC 4.0+)
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection(url, username, password);
            System.out.println("========== Database connection established successfully! ==========");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
