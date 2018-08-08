package com.mindtree.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import org.omg.CORBA.portable.ValueOutputStream;

import com.mindtree.entity.*;
import com.mindtree.Manager.CustomException;
import com.mindtree.Manager.InvalidDateException;
import com.mindtree.Manager.InvalidEmailException;
import com.mindtree.Manager.InvalidPhoneNumberException;
import com.mindtree.Manager.InvalidTestNameException;
import com.mindtree.connection.MyException;
import com.mindtree.dao.DatabaseConnect;

public class Function {
	Scanner input=new Scanner(System.in);

	public void addDetailsbyEmail(String email, String testname) throws InvalidEmailException, InvalidTestNameException, InvalidDateException, MyException
	{
		CheckException ob=new CheckException();
		DatabaseConnect addPatient= new DatabaseConnect();
		
		try {
		//CustomException ob =new CustomException();
			//ob.validemail(email);
			//ob.validTestName(testname);
			
			addPatient.verifyByEmail(email,testname);
			
			
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		System.out.println("Want to add more test[yes/no]");
		String ch=input.nextLine();
		
		if(ch.equalsIgnoreCase("yes"))
		{
			ob.checkEmailTestname();
			//addDetailsbyEmail(email,testname);
		}
		else if(ch.equalsIgnoreCase("no"))
		{
			System.out.println("Test Details are successfully saved !!");
		}
	}

	
	public void addDetailsbyPhone(String phone, String testname) throws InvalidPhoneNumberException, InvalidTestNameException, MyException
	{
		DatabaseConnect addPatient= new DatabaseConnect();
		CheckException ob=new CheckException();
		try
		{
			//CustomException ob =new CustomException();
			//ob.validPhone(phone);
			//ob.validTestName(testname);
			addPatient.verifyByPhone(phone,testname);
			
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		System.out.println("Want to add more test[yes/no]");
		String ch=input.nextLine();
		
		if(ch.equalsIgnoreCase("yes"))
		{
			ob.checkPhoneTestname();
			
			//addDetailsbyPhone(phone,testname);
		}
		else if(ch.equalsIgnoreCase("no"))
		{
			System.out.println("Test Details are successfully saved !!");
		}
	}
	
	public void generateReportbyEmail(String email, String date ) throws InvalidDateException, MyException, SQLException {
		
		DatabaseConnect viewDetails= new DatabaseConnect();
		//CustomException ob =new CustomException();
		//ob.validDate(date);
		ArrayList<GReport> list=viewDetails.VerifyReportbyEmail(email,date); 
		display(list);
		
		
		
	}
	
	
	public void generateReportbyPhone(String phone, String date ) throws MyException, SQLException, InvalidDateException
	{
		DatabaseConnect viewDetails= new DatabaseConnect();
		
		
		
		ArrayList<GReport> list=viewDetails.VerifyReportbyPhone(phone,date); 
		
		
			display(list);
		
	
//			System.out.println(e.getMessage());
		
		
		
		//	e.printStackTrace();
		
	}
	
	
	public void display(ArrayList<GReport> list) 
	{
		
		int sum=0;
		System.out.println("Output : ");
		System.out.println("--------");
		
	     System.out.println("Name : "+list.get(0).getName());
	     
		
		System.out.println("Email : "+ list.get(0).getEmail());
		System.out.println("Phone : "+ list.get(0).getPhone());
		System.out.println("Date : "+ list.get(0).getDob());
		
		
		System.out.println("Test Details : ");
		try {
		
			for(GReport obj: list)
			{
				System.out.println(obj.getTestname() + " " + obj.getCost());
			
				sum= sum+ Integer.valueOf(obj.getCost());
				
			}
			
			System.out.println("Total : " + sum);
		
		}catch(NumberFormatException e)
		{
			System.out.println("e");
		}
		
		
		
		
		
		
		
	}
}
