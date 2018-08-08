package com.mindtree.client;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.mindtree.Manager.InvalidDateException;
import com.mindtree.Manager.InvalidEmailException;
import com.mindtree.Manager.InvalidPhoneNumberException;
import com.mindtree.Manager.InvalidTestNameException;
import com.mindtree.connection.MyException;
import com.mindtree.service.CheckException;
import com.mindtree.service.Function;

public class Main {

	public static void main(String[] args) throws  InvalidTestNameException, InvalidPhoneNumberException, InvalidDateException, MyException, SQLException {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		Function fn=new Function();
        
		CheckException ob=new CheckException();
		
		System.out.println("XYZ Diagnostic Centre");
		System.out.println("-------------------------");
		System.out.println("1. Add Diagnostic Tests");
		System.out.println("2. Generate Report");
        System.out.println("3. Exit");
        System.out.println("Enter your choice");
        
        int ch=Integer.parseInt(input.nextLine());
      //  ArrayList<String> list=new ArrayList<String>();
        
        switch(ch)
        {
        
        case 1:  System.out.println("Enter test details");
                 System.out.println("-------------------");
        	     System.out.println("1. Fetch patient details by email");                	  
             	 System.out.println("2. Fetch patient details by phone ");
                	  
                 System.out.println("enter your choice");
               	 int ch1=Integer.parseInt(input.nextLine());
               	 
                 
                 
                	 if(ch1==1)
                     {
                		 try {
							
                			 ob.checkEmailTestname();
							
						} catch (InvalidEmailException e) {
							// TODO Auto-generated catch block
							
							e.printStackTrace();
						}
                    	 
                    	 
                     }
                     else if(ch1==2)
                     {
                        ob.checkPhoneTestname();
                     } 
                	 
                                                
                	break;
          
        case 2:   System.out.println("Generate Report");
                  System.out.println("-----------------");
                  System.out.println("1.Fetch Patient by email");
                  System.out.println("2.Fetch Patient by Phone");
                  System.out.println("enter your choice");
                  int ch3= Integer.parseInt(input.nextLine());
        
                  if(ch3==1)
                  {

					 
					ob.generateReportEmail();
                 	 
                  }
                  else if(ch3==2)
                  {
                	 ob.generateReportPhone();
                  }
                	
                  
                  break;
                	  
        case 3 : System.exit(0);       	  
                  
    		
        }
	}

}
