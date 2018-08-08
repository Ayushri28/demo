package project1;

import java.util.Scanner;


public class Sorting {

	
	
	public static void main(String[] args){
		
		
		Scanner  inpt = new Scanner(System.in);
		int n = inpt.nextInt();
		int[] arr= new int[n];
		System.out.println("enter elements");
		for(int i=0; i<n; i++)
		{
			arr[i]=inpt.nextInt();
		}
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n-1; j++)
			{
				if(arr[i]>arr[j+1])
				{
					int temp=arr[i];
					arr[i]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}  
		
		for(int i=0; i<n; i++)
		{
			System.out.println(arr[i]);
		}
		
		
	}
}
