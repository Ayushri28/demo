package Assign;

import java.util.Scanner;

public class Bubblesort {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
		System.out.println("enter range");
		int n=input.nextInt();
		
		int[] arr=new int[n];
		System.out.println("enter elements");
		for(int i=0; i<n ;i++)
		{
			arr[i]=input.nextInt();
		}
		
		for(int i=0; i<n-1; i++)
		{
			for(int j=0; j<(n-i-1); j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("after sorting array will be :");
		
		for(int i=0; i<n ; i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}