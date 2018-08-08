package com.mindtree.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlConn {

	Connection conn;
	
	public  MySqlConn() throws MyException {
		try {
			String username="root";
			String password="Welcome123";
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
			conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Diagnostic_DB", username, password);
			
			Statement stmt=conn.createStatement();
			
			ResultSet rs=((java.sql.Statement) stmt).executeQuery("select * from patient");
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+ rs.getString(3)+ " "+ rs.getString(4)+ " "+ rs.getDate(5));
			}
		
		}catch(SQLException e)
		{
			e.printStackTrace();
//			try {
			//throw new MyException("ERROR");
//			} catch (MyException e1) {
//				// TODO Auto-generated catch block
//				System.out.println("");
//				e1.printStackTrace();
//			}
		}
		
	}
	
	public Connection getConnection() {
		return conn;
	}
}
