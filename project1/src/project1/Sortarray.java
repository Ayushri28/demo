package project1;

import java.util.Scanner;

public class Sortarray {

	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		
		int n=input.nextInt();
		System.out.println("enter elements");
		int[] arr=new int[n];
		
		for(int i=0; i<n; i++)
		{
			arr[i]=input.nextInt();
			
		}
		
		for(int i=1; i<(n-1); i++)
		{
			for(int j=0; j<(n-i); j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
					
		}
		for(int i=0; i<n; i++)
		{
		System.out.println(arr[i]);
		}
		
	}
}
