package com.mindtree.service;

import java.sql.SQLException;
import java.util.Scanner;

import com.mindtree.Manager.InvalidDateException;
import com.mindtree.Manager.InvalidEmailException;
import com.mindtree.Manager.InvalidPhoneNumberException;
import com.mindtree.Manager.InvalidTestNameException;
import com.mindtree.connection.MyException;

public class CheckException {
	
	Scanner input= new Scanner(System.in);
	
	Function fn=new Function();
	public void checkEmailTestname() throws InvalidEmailException, InvalidTestNameException, InvalidDateException, MyException
	{
		 System.out.print("enter email\n");
    	 String email=input.nextLine(); 
    	 System.out.print("enter test name\n");
    	 String testname=input.nextLine();
    	
    	 fn.addDetailsbyEmail(email,testname);
	}
	
	public void checkPhoneTestname() throws InvalidPhoneNumberException, InvalidTestNameException, MyException
	{
		System.out.print("enter Phone Number\n");
   	 String phone=input.nextLine();                    	                   	 
   	 System.out.print("enter test name\n");
   	 String testname=input.nextLine();
   	 fn.addDetailsbyPhone(phone,testname);
	}
	
	public void generateReportEmail() throws InvalidDateException, MyException, SQLException
	{

  	    System.out.println("Enter email");
		 String email=input.nextLine();          	 
		                  	 
		 System.out.println("Enter test date");
		 String date=input.nextLine();
		 
		 fn.generateReportbyEmail( email,date);
	}
	
	public void generateReportPhone() throws MyException,InvalidDateException,SQLException {
		
		 System.out.println("Enter Phone Number");
     	 String phone=input.nextLine();
     	 
     	 
     	 System.out.println("Enter test date");
     	 String date=input.nextLine();
     	 
     	 fn.generateReportbyPhone(phone,date);
	}
	
	

}
