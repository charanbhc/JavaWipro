package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Createdatabase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			Class.forName("com.mysql.jdbc.Driver");//Register the driver
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root","12345678"); //Database create connection
			Statement stmt = con.createStatement();//create statemt
			 String sql = "DROP DATABASE wiproDemo";//create database daabase name;
			 stmt.executeUpdate(sql);
			 System.out.println("Database Dropped successfully...");

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
