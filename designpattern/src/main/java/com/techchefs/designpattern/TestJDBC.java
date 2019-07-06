package com.techchefs.designpattern;

import com.mysql.jdbc.Driver;

import java.sql.*;

public class TestJDBC {
	public static void main(String[] args) {
		Connection con = null;
		Statement stm = null;
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			String dbUrl = "jdbc:mysql://localhost:3306/TECHCHEFS_DB";
			con = DriverManager.getConnection(dbUrl,"root","root");
			
			String Query = "Select * from employee where id =1";
			
		} catch(Exception e) {
			
		}
	}

}
