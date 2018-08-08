package com.mindtree.Manager;


import com.mindtree.entity.Patient;
import com.mindtree.entity.Test;


public class CustomException {	
	

	public  String validemail(String email) throws InvalidEmailException{
		
		//Patient patient=new Patient(); 
		//patient.setEmail(email);
		if(email!=null)
		{
			return email;
		}
		else
		{
			throw new InvalidEmailException("Invalid email id please check your input");
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
			//InvalidEmailException x=new InvalidEmailException(phone);
			throw  new InvalidPhoneNumberException("Invalid phone number please check your input");
		}
	}
	
	public  String validTestName(String testname) throws InvalidTestNameException
	{
		Test test=new Test(); 
		test.setTestname(testname);
		if(testname.equals(test.getTestname()))
		{
			return testname;
		}
		else
		{
			//InvalidEmailException y=new InvalidEmailException(testname);
			throw new InvalidTestNameException("Invalid Test Name please check your input");
		}
	}
	
	
	public  String validDate(String date) throws InvalidDateException
	{
		Patient pt=new Patient(); 
		if(date.equals(pt.getDob()))
		{
			return date;
		}
		else
		{
			//InvalidEmailException y=new InvalidEmailException(date);
			throw new InvalidDateException("Invalid date please check your input");
		}
	}
}


