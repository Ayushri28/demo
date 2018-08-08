package com.mindtree.connection;

import java.sql.*;
import java.util.Scanner;



public class MySqlConnection {
	
	//static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/EMP";
	
	static final String USER = "root";
	static final String PASS = "Welcome123";
	   
	
	public static void MySqlConn() { 
		
		Connection conn = null;
		Statement stmt = null;  
		
		Scanner input=new Scanner(System.in);
	
	try{
	      Class.forName("com.mysql.jdbc.Driver");

	      System.out.println("Connecting to database...");
	      conn = DriverManager.getConnection(DB_URL,USER,PASS);

	      //System.out.println("Creating statement...");
	      //stmt = conn.createStatement();
	  
	      void public dbEmail(String email)
	      {
	    	  
	    	  String sql;
		      
		      System.out.println("enter email of the patient");
		      String email=input.next();
		      
		      sql = "Select * from Patient where email=?";
		      //ResultSet rs = stmt.executeQuery(sql);

		      PreparedStatement ps=conn.prepareStatement(sql);
		      ps.setString(1, email);
			  ResultSet rs=ps.executeQuery(); 
			  
			  
		    // System.out.println(pid+name+phone);
			  
			  
	      }

	      
		  
	    
	      //rs.close();
	      stmt.close();
	      conn.close();
	   
	}catch(SQLException e){
		  
	      e.printStackTrace();
	   }catch(Exception e1){
	      
		   e1.printStackTrace();
		   }
	
	      
	
	
     }
}
