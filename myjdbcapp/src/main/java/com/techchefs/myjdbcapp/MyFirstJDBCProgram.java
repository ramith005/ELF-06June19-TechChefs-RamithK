package com.techchefs.myjdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

import lombok.extern.java.Log;

@Log
public class MyFirstJDBCProgram {

	public static void main(String[] args) {
		
		Connection con = null;
		String query = null;
		Statement stm = null;
		ResultSet rs = null;
		//1.Load the Driver
		try {
			Driver driver = new Driver();
			DriverManager.deregisterDriver(driver);
			
			//2. Get the "DB Connection" via Driver
			String dbUrl = "jdbc:mysql://localhost:3306/TECHCHEFS_DB?user=root&password=root";
			con = DriverManager.getConnection(dbUrl);
			
			//3.Issue the "SQL queries" via connection
			query = "select * from employee_info;";
			stm = con.createStatement();
			rs = stm.executeQuery(query);
			
			//4.Process the result returned by "SQL Queries"
			while(rs.next()) {
				log.info("ID : "+rs.getInt("ID"));					
				log.info("NAME:"+rs.getString("NAME"));
				log.info("AGE :"+rs.getInt("AGE"));
				log.info("GENDER :"+rs.getString("GENDER"));
				log.info("SALARY :"+rs.getDouble("SALARY"));
				log.info("PHONE :"+rs.getLong("PHONE"));
				log.info("JOINING_DATE :"+rs.getDate("JOINING_DATE"));
				log.info("ACCOUNT_NUMBER :"+rs.getInt("ACCOUNT_NUMBER"));
				log.info("EMAIL 	:"+rs.getString("EMAIL"));
				log.info("DESIGNATION :"+rs.getString("DESIGNATION"));
				log.info("DOB  :"+rs.getDate("DOB"));
				log.info("DEPT_ID:"+rs.getInt("DEPT_ID"));
				log.info("MNGR_ID :"+rs.getInt("MNGR_ID"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
				try {
					if(con!=null) {
						con.close();
					}
					if(stm!=null) {
						stm.close();
					}
					if(rs!=null) {
						rs.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
