package project1;

import java.util.Scanner;

public class Swap {

	public static void main(String args[])
	{
		int temp=0;
		Scanner input=new Scanner(System.in);
		int n= input.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements");
		for(int i=0; i<n; i++)
		{
			arr[i]=input.nextInt();
			
		}
		for(int i=0; i<n; i++)
		{
			for(int j=1; j<(n-i); j++)
			{
			if(arr[j-1]>arr[j])
			{
				temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
			}
			}
				
		}
		for(int i=0; i<n; i++)
		{
		System.out.print(arr[i]+ " ");
	
		}
    }
}