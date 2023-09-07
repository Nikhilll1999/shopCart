package com.nctech.shopCart.config;

import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration
public class DBConfig {
    private String url ="jdbc:mysql://localhost:3306/shopCart ";
    private String userid ="Nikhil";
    private String password ="Pass@1234";
public Connection getConnection() throws SQLException {
    return DriverManager.getConnection(url,userid,password);
}
}
