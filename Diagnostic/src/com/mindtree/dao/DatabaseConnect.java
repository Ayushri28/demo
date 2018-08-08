package com.mindtree.dao;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import com.mindtree.Manager.InvalidDateException;
import com.mindtree.Manager.InvalidEmailException;
import com.mindtree.Manager.InvalidTestNameException;
import com.mindtree.connection.*;
import com.mindtree.entity.GReport;
import com.mindtree.entity.Patient;
 public class DatabaseConnect{

	 Connection conn;
	 
	
	 
	 
	 public DatabaseConnect() throws MyException {
		 
		try {
			MySqlConn obj =new MySqlConn();
			//obj = new MySqlConn();
			conn=obj.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new MyException("ERROR");
			
			//e.printStackTrace();
		}
		 
	 }
	 
	 public void verifyByEmail(String email, String testname) throws SQLException, InvalidEmailException, InvalidTestNameException, InvalidDateException
	 {
		 int pid=-1;
		 int tid=-1;
		 //System.out.println(email);
		 //System.out.println(testname);

		PreparedStatement getP=conn.prepareStatement("select pid from patient where email=?");
	
		getP.setString(1, email);
		
		
		
		
		ResultSet rsP=getP.executeQuery();
		
		//int pid=0;
		if(rsP.next())
		{
			pid=rsP.getInt(1);
			//System.out.println(pid);
		}
		//rsP.close();
	
		PreparedStatement getT=conn.prepareStatement("select tid from Test where name=?");
		getT.setString(1, testname);
		
		//int tid=0;
		ResultSet rsT=getT.executeQuery();
		if(rsT.next())
		{
			//System.out.println("dfgh");
			tid=rsT.getInt(1);
			//System.out.println("tid="+tid);
		}
	
		if(pid>0 && tid>0)
		{
			Date date=new Date();
			SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
			
			String date1=formatter.format(date);
			
			PreparedStatement insertDetails=conn.prepareStatement("insert into Patient_test values(?,?,?)");
			insertDetails.setInt(1,pid);
			insertDetails.setInt(2,tid);
			insertDetails.setString(3,date1);
			
			insertDetails.executeUpdate();
			
		}
		else {
			System.out.println("Invalid data");
		}
		
		
	 }
	 
	 public void verifyByPhone(String phone , String testname) throws SQLException
	 {
		 PreparedStatement getP=conn.prepareStatement("select pid from Patient where phone=?");
			getP.setString(1, phone);
			
			ResultSet rsP=getP.executeQuery();
			int pid=0;
			
			while(rsP.next())
			{
				pid=rsP.getInt(1);
			}
			
			PreparedStatement getT=conn.prepareStatement("select tid from Test where name=?");
			getT.setString(1,testname);
			
			ResultSet rsT=getT.executeQuery();
			
			int tid=0;
			
			while(rsT.next())
			{
				tid=rsT.getInt(1);
			}
			
			if(pid>0 && tid>0)
			{
				Date date=new Date();
				SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyy");
				
				String date1=formatter.format(date);
				
				PreparedStatement insertDetails=conn.prepareStatement("insert into Patient_test values(?,?,?)");
				insertDetails.setInt(1,pid);
				insertDetails.setInt(2,tid);
				insertDetails.setString(3,date1);
				
				insertDetails.executeUpdate();
			}
			
	 }
 
	 
	 
	 public ArrayList<GReport> VerifyReportbyEmail(String email, String date) 
	 {
		 ArrayList<GReport> list = null;
		try
		{
			 PreparedStatement getRepE=conn.prepareStatement("select p.name,p.email,p.phone,pt.date,t.cost, t.name from Patient p inner join Patient_test pt inner join Test t on p.pid=pt.pid and t.tid=pt.tid and p.email=? and pt.date=? order by t.name");  
			//System.out.println("aaaa");	
			 getRepE.setString(1, email);
			 getRepE.setString(2, date.trim());
			 
			ResultSet rs=getRepE.executeQuery();
			
			
			list=new ArrayList<GReport>();
			
			while(rs.next())
			{
				//System.out.println("shshs");
				GReport ob=new GReport();
				
				
				ob.setName(rs.getString(1));
				ob.setEmail(rs.getString(2));
				ob.setPhone(rs.getString(3));
				ob.setDob(rs.getString(4));
				ob.setTestname(rs.getString(6));
				ob.setCost(rs.getString(5));
			
				list.add(ob);
				//conn.close();
				//getRepE.close();
			}
		}
		catch(SQLException e)
		{
			System.out.println("Connection failed");
		}
			
			return list;
		 
		// PreparedStatement getD=conn.prepareStatement("select testname,cost from Test where date=?");
			//getD.setString(2, date);
	 }
 
 
	 public ArrayList<GReport> VerifyReportbyPhone(String phone, String date)
	 {
		 ArrayList<GReport> list=null;
		 try
		 {
			 PreparedStatement getRepP=conn.prepareStatement("select p.name,p.email,p.phone,pt.date, t.cost, t.name from Patient p inner join Patient_test pt inner join Test t on p.pid=pt.pid and t.tid=pt.tid and p.phone=? and pt.date=? order by t.name");
				getRepP.setString(1, phone);
				getRepP.setString(2, date.trim());
			 
				ResultSet rs=getRepP.executeQuery();
				
				
				 list=new ArrayList<GReport>();
				
				while(rs.next())
				{
					GReport ob=new GReport();
					
					
					ob.setName(rs.getString(1));
					ob.setEmail(rs.getString(2));
					ob.setPhone(rs.getString(3));
					ob.setDob(rs.getString(4));
					ob.setTestname(rs.getString(6));
					ob.setCost(rs.getString(5));
					
					list.add(ob);
				//	conn.close();
					//getRepP.close();	
				} 
		 }catch(SQLException e)
		 {
			System.out.println("connection failed"); 
		 }
		
			
				
				return list;
		// PreparedStatement getD=conn.prepareStatement("select testname,cost from Test where date=?");
			//getD.setString(2, date);
	 }
 }
