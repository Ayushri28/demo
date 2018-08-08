package Training;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
	
	public int Add(int a, int b)
	{
		return a+b;
	}
	
	public int Subtract(int a, int b)
	{
		return a-b;
	}
	
	public int Multiply(int a, int b)
	{
		return a*b;
	}
	
	public int Divide(int a, int b)
	{
		return a/b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner input=new Scanner(System.in);
	
	
	Calculator ob=new Calculator();
	System.out.println("enter choice 1. ADD  2.SUBSTRACT  3.MULTIPLY  4.DIVIDE");
	//int ch=input.nextInt();
	try{
		
		try{
			int ch=input.nextInt();
			
			switch(ch)
			{
			
			case 1: System.out.println("enter 1st and 2nd no. for adding");
			        int x=input.nextInt();
			        int y=input.nextInt();
			        System.out.println("Add Operation : ");
			        System.out.println("Result="+ob.Add(x,y));
			        break;
			        
			case 2:System.out.println("enter 1st and 2nd no. for substraction");
			       int x1=input.nextInt();
			       int y1=input.nextInt();
			       System.out.println("Subtract Operation : ");
			       System.out.println("Result="+ob.Subtract(x1,y1));
			       break;
			       
			case 3:System.out.println("enter 1st and 2nd no. for multiplication");
			       int x2=input.nextInt();
			       int y2=input.nextInt();		
			       System.out.println("Multiply Operation : ");
			       System.out.println("Result="+ob.Multiply(x2,y2));
			       break;
			       
			case 4:System.out.println("enter 1st and 2nd no. for division");
			       int x3=input.nextInt();
			       int y3=input.nextInt();
			       System.out.println("divide Operation : ");
			       System.out.println("Result="+ob.Divide(x3,y3));
			       break;
			       
			default : System.out.println("invalid choice");
			       
			}
			
			
		}catch(InputMismatchException e)
		{
			System.out.println(e + "  enter any numeric value");
			//System.out.println("enter any numeric value");
		}
	
	}catch(ArithmeticException e)
	{
		System.out.println(e);
		System.out.println("cannot be divided by zero");
	}
	finally{
		System.out.println("successful run");
	}
	
	
	
		

	}

}
