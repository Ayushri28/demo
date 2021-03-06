package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;





public class DatabaseConnect {

	Connection con;
	
	public DatabaseConnect()
	{
		MySqlConn ob=new MySqlConn();
		con=ob.getConnection(); 
	}
	
	public int verifyByEmail(String addby, String tstnameKey, String idorphoneKey) throws SQLException
	{
		
		System.out.println("email or phone"+addby);
		int pid=0, tid=0,i=-1;
		PreparedStatement getP = null;
		if(idorphoneKey.equalsIgnoreCase("email"))
		{
		 getP=con.prepareStatement("select pid from patient where email=?");
			getP.setString(1, addby);
			
		}
		else if(idorphoneKey.equalsIgnoreCase("phone"))
		{
		 getP=con.prepareStatement("select pid from patient where phone=?");
			getP.setString(1, addby);
			
		}
		

		ResultSet rsP=getP.executeQuery();
		
		
		if(rsP.next())
		{
			pid=rsP.getInt(1);
		
		}
		
		PreparedStatement getT=con.prepareStatement("select tid from Test where name=?");
		getT.setString(1, tstnameKey);
		
	
		ResultSet rsT=getT.executeQuery();
		if(rsT.next())
		{
		
			tid=rsT.getInt(1);
		
		}
	System.out.println("pid="+pid+"tid:"+tid);
		if(pid>0 && tid>0)
		{
			Date date=new Date();
			SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
			
			String date1=formatter.format(date);
			
			PreparedStatement insertDetails=con.prepareStatement("insert into Patient_test values(?,?,?)");
			insertDetails.setInt(1,pid);
			insertDetails.setInt(2,tid);
			insertDetails.setString(3,date1);
			
			i=insertDetails.executeUpdate();
			
		}
		
		return i;
		
	}
	
	/*
	
	 public int verifyByPhone(String addbyKeyP, String tstnameKey) throws SQLException
	 {
		 int i=-1;
		 PreparedStatement getP=con.prepareStatement("select pid from Patient where phone=?");
			getP.setString(1, addbyKeyP);
			
			ResultSet rsP=getP.executeQuery();
			int pid=0;
			
			while(rsP.next())
			{
				pid=rsP.getInt(1);
			}
			
			PreparedStatement getT=con.prepareStatement("select tid from Test where name=?");
			getT.setString(1,tstnameKey);
			
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
				
				PreparedStatement insertDetails=con.prepareStatement("insert into Patient_test values(?,?,?)");
				insertDetails.setInt(1,pid);
				insertDetails.setInt(2,tid);
				insertDetails.setString(3,date1);
				
				i=insertDetails.executeUpdate();
			}
			return i;
			
			
			
	 }  */
	
	
	public String verifyReport(String generatebyKey, String tstdateKey,String idormail) throws SQLException
	{
		//System.out.println("gen"+generatebyKey+"date:"+tstdateKey+"kaa"+idormail);
		int i=-1;
		PreparedStatement getRep;
		if(idormail.equals("email"))
		{
			getRep=con.prepareStatement("select p.name,p.email,p.phone,pt.date,t.cost, t.name from Patient p inner join Patient_test pt inner join Test t on p.pid=pt.pid and t.tid=pt.tid and p.email=? and pt.date=? order by t.name");
			getRep.setString(1,generatebyKey);
			getRep.setString(2,tstdateKey.trim());
			
		}
		else
		{
			getRep=con.prepareStatement("select p.name,p.email,p.phone,pt.date, t.cost, t.name from Patient p inner join Patient_test pt inner join Test t on p.pid=pt.pid and t.tid=pt.tid and p.phone=? and pt.date=? order by t.name");
			getRep.setString(1,generatebyKey);
			getRep.setString(2,tstdateKey.trim());
			
		}
		
		ResultSet rs=getRep.executeQuery();
		String str="<table><th>Test Name</th><th> Cost</th>";
		String details="";
		int total=0;
		while(rs.next())
		{
			total+=rs.getInt(5);
			details="name :" + rs.getString(1) + " <br> email :" +rs.getString(2) + "<br>test date :" + rs.getString(4)+"<br>TotalCost="+total;
			str=str+"<tr><td>"+rs.getString(6)+"</td><td>"+rs.getString(5)+"</td></tr>";
			
		}
		
		
		str=str+"</table>";
		str="<div>"+details+"</div>"+str;
		
		return str;
		
	}    
 
}
