package com.outlook.ejanovitz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    private static Database instance = new Database();

    private Database(){}

    public static Database getInstance(){
        return instance;
    }

    public Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/prison";
        String user = "root";
        String password = "Luc!feR2017";
        return DriverManager.getConnection(url, user, password);
    }
}
