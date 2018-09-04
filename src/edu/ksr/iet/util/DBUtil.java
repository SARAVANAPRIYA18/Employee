package edu.ksr.iet.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBUtil {

	
	public static Connection getConnection(){
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("called");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/employeemanagement","root","");
	
		} catch (Exception e) {
			System.out.println("no");
			e.printStackTrace();
		}
		return connection;
	}	public static void close(Connection con,Statement stmt,ResultSet rs){
		try {
			if(rs != null)
				rs.close();
			if(stmt != null)
				stmt.close();
			if(con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
