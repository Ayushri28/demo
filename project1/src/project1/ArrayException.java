package project1;

import java.util.Scanner;

public class ArrayException {

	

	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter range of array");
		int n=input.nextInt();
		int[] arr=new int[n];
		System.out.println("enter elements");

		try{
			
		for(int i=0; i<n; i++)
		{
			arr[i]=input.nextInt();
			if(!isdigit(arr[i]))
			{
				String exception = "inputting char value in int array";
				throw  exception;
			}
		}
		
		}catch( Exception e)
		{
			//e.getMessage();
			if(e.getMessage()=="inputting char value in int array")
			System.out.println(e.getMessage());
		}
	}

	private static boolean isdigit(int i) {
		// TODO Auto-generated method stub
		if(i>=0 && i<=9)
		return true;
		else 
			return false;
	}
}
