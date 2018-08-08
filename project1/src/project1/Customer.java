package project1;

import java.util.Scanner;

public class Customer {

	private String name="";
	private String mobileno="";
	private Double feedback=0.0d;
	Customer()
	{
		
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public Double getFeedback() {
		return feedback;
	}

	public void setFeedback(Double feedback) {
		this.feedback = feedback;
	}

	public static void main(String args[])
	{
		System.out.println("enter the no of customers");
		Scanner inpt=new Scanner(System.in);
		int N=inpt.nextInt();
		
		Customer[] obj= new Customer[N];
		for(int i=0;i<N;i++)
		{
		
			obj[i]=new Customer();
			System.out.println("enter name");
			String name=inpt.next();
			obj[i].setName(name);
			System.out.println("enter mobileno.");
			String mobileno=inpt.next();
			obj[i].setMobileno(mobileno);
			System.out.println("enter feedback");
			Double feedback=inpt.nextDouble();
			obj[i].setFeedback(feedback);
			
		}
		
		for(int i=0; i<N; i++)
		{
			
			System.out.println(obj[i].getFeedback());
		}
		
		
		
	}
}
