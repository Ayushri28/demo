package com.mindtree.client;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

import com.mindtree.entity.Test;
import com.mindtree.manager.CustomException;
import com.mindtree.manager.InvalidEmailIdException;
import com.mindtree.service.ServiceImp;

public class Main {

	public static void main(String[] args) {
	
		
		Scanner input=new Scanner(System.in);
		
		
		System.out.println("XYZ Diagnostic Centre");
		System.out.println("-------------------------");
		System.out.println("1. Add Diagnostic Tests");
		System.out.println("2. Generate Report");
        System.out.println("3. Exit");
        System.out.println("Enter your choice");
        
        
        int ch=Integer.parseInt(input.nextLine());
        
        Test test=new Test();
        int pid;
        
        ArrayList<Test> list= new ArrayList<Test>();
        
         switch(ch)
         {
         
         case 1: System.out.println("Enter test details");
                 System.out.println("-------------------");
                 System.out.println("1. Fetch patient details by email");
                 System.out.println("1. Fetch patient details by phone");
                 System.out.println("enter your choice");
                 int ch1=Integer.parseInt(input.nextLine());
                 
                 String ch2="yes";
               
                 while(ch2.equalsIgnoreCase("yes"))
                 {
                	
                	 if(ch1==1)
                     {
                    	 System.out.print("Enter Email : ");
                    	 String email=input.next();
                    	CustomException ob=new CustomException();
                    	String s=ob.validemail(email);
                    	if(s.equals(email))
                    		
                    	{
                    		pid=new ServiceImp().fetchByEmail(email).getP_ID;
                    		
                    	}
                    	
                    	 
                    	 System.out.println("Enter Test Name : ");
                    	 String testname=input.next();
                    	 
                    	 test= ob.validTestName(testname).new ServiceImp().fetchTestdetails(testname);
                    	 
                    	 
                    	 new ServiceImp().PatientTestInsert(list,pid);
                    	 
                     }else if(ch1==2){
                    	 
                         System.out.print("Enter Phone : ");
                         String phone=input.next();
                         CustomException ob1=new CustomException();
                         pid=ob1.(phone).new ServiceImp().fetchByPhone(phone);
                                            	 
                    	 System.out.println("Enter Test Name : ");
                    	 String testname=input.next();
                    	 test= ob.validTestName(testname).new ServiceImp().fetchTestdetails(testname);
                    	 
                    	 
                    	 new ServiceImp().PatientTestInsert(list,pid);
                    	 
                     }
                     
                     System.out.println("Want to add more test [yes/no]");
                      ch2=input.next();      
                 }
                 
                 break;
                           
        	 
         case 2: System.out.println("Generate Report");
                 System.out.println("-----------------");
                 System.out.println("1.Fetch Patient by email");
                 System.out.println("2.Fetch Patient by Phone");
                 System.out.println("enter your choice");
                 int ch3= input.nextInt();
                 
                 if(ch3==1)
                 {
                	 System.out.println("Enter email");
                	 String email=input.next();
                	 
                	 
                	 
                	 System.out.println("Enter test date");
                	 String date=input.next();
                	 
                	 CustomException ob1=new CustomException();
                	 
                	 ob1.
                	 
                 }
                 else if(ch3==2)
                 {
                	 System.out.println("Enter Phone Number");
                	 String phone=input.next();
                	 
                	 
                	 System.out.println("Enter test date");
                	 String date=input.next();
                	 
                	 
                 }
        	 
         case 3: System.exit(0);
               
         
         default : System.out.println("Invalid choice");
        	 
         }
		
	}

}
