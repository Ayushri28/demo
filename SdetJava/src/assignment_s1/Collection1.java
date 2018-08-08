package assignment_s1;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Collection1 {
	

	
	
	public List<String> isNumberValid(String[] input) {
		
		
		ArrayList<String> list=new ArrayList<String>();
		
		//int count=0;
		
        for(int i=0; i<input.length; i++)
        {
        	int count=0;
        	String str=input[i];
        	
        	for(int j=0; j<str.length(); j++)
        	{
        		if(str.charAt(j)=='.')
        			count++;
        		
        		int ascii= (int)(str.charAt(j));
        		if(ascii<47 && ascii>58)
        		{
        			list.add("Invalid");
        			break;
        		}
        		
        	}
        	 if(count==0)
             	
         		list.add("Integer");
         	
         	 if(count==1)
         		
         		list.add("Decimal");
         	
         	 if(count>1)
         		
         		list.add("Invalid");
        }
       
		
		
		
		return list;
		
		
		
	}
 
	public static void main(String args[])
	{
	
		Collection1 ob=new Collection1();
		Scanner input=new Scanner(System.in);
		System.out.println("enter no of strings want to enter");
		int n=input.nextInt();
		String[] str=new String[n];
		
		for(int i=0; i<str.length; i++)
		{
		
			System.out.println("Enter the string");
			
			str[i]=input.next();
		}
		
		 List<String> s=  ob.isNumberValid(str);
		 System.out.println(s);
		 
		
		

		
	}


}
