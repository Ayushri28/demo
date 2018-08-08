package project1;

import java.util.Scanner;

public class Exceptionhandle {

	
	private static final Exception ArrayIndexOutOfBound = null;
	private static final Exception ArithmeticException = null;

	public static void main(String args[])
	{
	
		Scanner input= new Scanner(System.in);
		System.out.println("enter range of an array");
		int n=input.nextInt();
		int[] arr= new int[n];
		
		System.out.println("enter elements of an array");
		try
		{
			try
			{
				int b=50;
				int a=input.nextInt();
				int div=b/a;
				if(a==0)
				{
					throw ArithmeticException;
				}
				
			}catch( Exception e)
			{
				System.out.println("value of a should not be 0");
				
			}
		
		for(int i=0; i<n; i++)
		{
			arr[i]=input.nextInt();
			if(i>n)
				throw ArrayIndexOutOfBound ;
		}
		
	}catch( Exception e)
	{
		System.out.println("value of the i should be less than n");
			
	}
		
	}
}
