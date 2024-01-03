package com.Bus_Reservation;

import java.sql.*;

public class Db_connection {
    private static final String URL = "jdbc:mysql://localhost:3306/Bus_reservation";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root321";

    public static Connection getConnection() throws SQLException {
        try {
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            System.err.println("Error establishing a database connection: " + e.getMessage());
            throw e;
        }
    }
}
