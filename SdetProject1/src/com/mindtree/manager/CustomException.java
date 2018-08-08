package com.mindtree.manager;

import java.sql.Date;

import com.mindtree.entity.Patient;
import com.mindtree.entity.Test;
import com.mindtree.manager.InvalidEmailIdException.InvaliTestNameException;
import com.mindtree.manager.InvalidEmailIdException.InvalidDateException;
import com.mindtree.manager.InvalidEmailIdException.InvalidPhoneNumberException;
import com.mindtree.manager.InvalidEmailIdException.InvalidTestNameException;

public class CustomException {
	
	public CustomException()
	{
		
	}

	public  String validemail(String email) throws InvalidEmailIdException{
		
		Patient patient=new Patient(); 
		if(email.equals(patient.getEmail()))
		{
			return email;
		}
		else
		{
			throw new InvalidEmailIdException("Invalid email id please check your input");
		}
	}
	
	public  String validPhone(String phone) throws InvalidPhoneNumberException
	{
		Patient patient=new Patient(); 
		if(phone.equals(patient.getPhone()))
		{
			return phone;
		}
		else
		{
			InvalidEmailIdException x=new InvalidEmailIdException(phone);
			throw  x.new InvalidPhoneNumberException("Invalid phone number please check your input");
		}
	}
	
	public  String validTestName(String testname) throws InvalidTestNameException
	{
		Test test=new Test(); 
		if(testname.equals(test.getTestname()))
		{
			return testname;
		}
		else
		{
			InvalidEmailIdException y=new InvalidEmailIdException(testname);
			throw y.new InvalidTestNameException("Invalid Test Name please check your input");
		}
	}
	
	
	public  String validDate(String date) throws InvalidDateException
	{
		Patient test=new Patient(); 
		if(date.equals(test.getDOB()))
		{
			return date;
		}
		else
		{
			InvalidEmailIdException y=new InvalidEmailIdException(date);
			throw y.new InvalidDateException("Invalid date please check your input");
		}
	}
}
