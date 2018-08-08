package project1;

import java.util.Scanner;

public class Validate {

	static String validateMobileNo(String str1)
	{
			
		Exception exception;
		if(str1.length()!=10)
		{
		
			return "false:invalid mobile no";
		}
		for(int i=0; i<str1.length(); i++)
		{
			if(Character.isDigit(str1.charAt(i)))
			{
				continue;
			}
			else
				
			{
				return "false:invalid mobile no";
			}
		}
		
		if(str1.charAt(0)!='9')
		{
			return "false:invalid mobile no";
		}
		return "true:valid number";
	}
	
	
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		String str= new String();
		System.out.println("enter mobile number");
			
		try{
			
			str=input.next();
			String s=validateMobileNo(str);
			if(s.equals("false:invalid mobile no")){
				throw new Exception("INvalid number");
			
			}
			else if(s.equals("true:valid number"))
			{
				System.out.println(s);
			}
		}catch(Exception e){
		    System.out.println(e.getMessage());
		}
		
	 
	
	
	
	}


		
		
}
