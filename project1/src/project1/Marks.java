package project1;

import java.util.Scanner;

public class Marks {

	public static void main(String args[])
	{
		int n=0,sum=0;
		
		System.out.println("how many subjects");
		Scanner input= new Scanner(System.in);
		n= input.nextInt();
		int[] arr=new int[n];
		
		
		
		for(int i=0; i<n; i++)
		{
			System.out.println("enter the marks");
			arr[i]=input.nextInt();
			sum+=arr[i];
		}
		
		System.out.println("Total marks = "+sum);
		
		float per=((sum/n));
		System.out.println("percentage = " + per);
	}
}