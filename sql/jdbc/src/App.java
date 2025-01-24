package com.javajdbcclass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class App {

    public static void main(String[] args) {
        try {
            // Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Open a connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/wipro", 
                "root", 
                "12345678"
            );

            // Execute SQL query
            Statement stmt = con.createStatement();

            String sql = "CREATE TABLE IF NOT EXISTS Registration ("
                       + "id INTEGER NOT NULL, "
                       + "name VARCHAR(255), "
                       + "PRIMARY KEY (id))";
            stmt.executeUpdate(sql);

            System.out.println("Table 'Registration' created successfully.");
            con.close();

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("SQL Error occurred!");
            e.printStackTrace();
        }
    }
}



// package com.database;

// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.Statement;

// public class Createdatabase {

// 	public static void main(String[] args) {
// 		// TODO Auto-generated method stub

// 		try {
			
// 			Class.forName("com.mysql.jdbc.Driver");//Register the driver
// 			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root","chiranjeevi@12345"); //Database create connection
// 			Statement stmt = con.createStatement();//create statemt
// 			 String sql = "DROP DATABASE wiproDemo";//create database daabase name;
// 			 stmt.executeUpdate(sql);
// 			 System.out.println("Database Dropped successfully...");

// 		} catch (Exception e) {
// 			// TODO: handle exception
// 		}
// 	}

// }